package quickfix.examples.datapub;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import quickfix.examples.datapub.logic.Point;
import quickfix.examples.datapub.logic.RandomWalk;
import quickfix.examples.vo.MarketRealDataVo;
/**
 * 数据产出run run run
 * @author niepoo
 *
 */
public class DataRunnable implements Runnable{
    	private MarketRealDataVo curMRDataVo = null;
    	private MarketRealDataVo preMRDataVo = null;
    	private List<MarketRealDataVo> runDataVolist = null;
    	private RandomWalk randomWalk= null;
    	public DataRunnable(MarketRealDataVo vo){
    		curMRDataVo = vo;
    		randomWalk = new RandomWalk(new Point(0,0),0,0);
    	}
    	public DataRunnable(List<MarketRealDataVo> list){
    		runDataVolist = list;
    		randomWalk = new RandomWalk(new Point(0,0),0,0);
    	}
    	
		@Override
		public void run() {
			Calendar curCalendar = Calendar.getInstance();
			if(runDataVolist!=null && runDataVolist.size()>0){
				for (Iterator iterator = runDataVolist.iterator(); iterator.hasNext();) {
					curMRDataVo = (MarketRealDataVo) iterator.next();
					doTask(curCalendar);
				}
			}else{
				doTask(curCalendar);
			}
			}
		/**
		 * 进行具体任务
		 * @param curCalendar
		 */
		private void doTask(Calendar curCalendar){
			String quotetime=curCalendar.getTime().toString();
			curMRDataVo.setQuotetime(quotetime);
			int code = curMRDataVo.getSecucode();
			String codeStr = "" + code;
			//System.out.println("股票代码：" + curMRDataVo.getSecucode() + ",行情时间：" + curMRDataVo.getQuotetime());
			RoundQueue<MarketRealDataVo> rq =null;
			if(!MarketDataProviderImpl.marketDataRQ.containsKey(codeStr)){
				rq = new RoundQueue<MarketRealDataVo>(MarketDataProviderImpl.mdrqSize);
				MarketDataProviderImpl.marketDataRQ.put(codeStr, rq);
			}else{
				rq =MarketDataProviderImpl.marketDataRQ.get(codeStr);
				preMRDataVo=rq.getTail();
				Point curPoint = new Point(curCalendar.getTimeInMillis(),preMRDataVo.getClose());
				randomWalk.setCurrentPoint(curPoint);
				if(randomWalk.calculateNextPosition()){
					curPoint = randomWalk.getCurrentPoint();
					curMRDataVo.setClose(curPoint.getY());
				}
				
			}
			//System.out.println("股票代码：" + curMRDataVo.getSecucode() + ",行情时间：" + curMRDataVo.getQuotetime() +",价钱：" + curMRDataVo.getClose());
			rq.pushLast(curMRDataVo);
		}
    }