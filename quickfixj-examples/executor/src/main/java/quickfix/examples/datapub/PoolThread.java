package quickfix.examples.datapub;

import java.util.List;
import java.util.Queue;

public class PoolThread extends Thread {
	private boolean done = false;
	private Queue<PoolThread> pool = null;//所在的线程池
	private Runnable r; //要执行的线程操作

	/**
	 * Start thread immediately upon construction.
	 */
	public PoolThread(Queue<PoolThread> pool, List<PoolThread> unloader) {
		super();
		setDaemon(true);
		this.pool = pool;
		start();
		unloader.add(this);
	}

	/**
	 * Causes thread to start shutting down.
	 */
	synchronized void apoptosis() {
		done = true;
		interrupt();
	}

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				while (!done && r == null) {
					try {
						wait();
					} catch (InterruptedException e) {
						if (!done)
							e.printStackTrace();
					}
				}
			}
			if (done)
				break;
			try {
				r.run();
			} catch (Throwable t) {
				t.printStackTrace();
			}
			r = null;
			synchronized (pool) {
				pool.add(this);
				pool.notify();
			}
		}
	}

	synchronized void setR(Runnable r) {
		this.r = r;
		notify();
	}
}