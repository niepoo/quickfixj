package quickfix.examples.datapub;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import quickfix.examples.executor.MarketDataProvider;

public class MarketDataProviderImpl implements MarketDataProvider{
	//实时行情对应循环队列
	static Map<String,RoundQueue<MarketRealDataVo>> marketDataRQ = new HashMap<String,RoundQueue<MarketRealDataVo>>();
	static final int mdrqSize = 1000;
	static Thread dataCreateThread  = null;
	static List<MarketRealDataVo> initMarketDataList = new ArrayList<MarketRealDataVo>();
	//构造执行线程
	public MarketDataProviderImpl(){
		if(dataCreateThread ==null){
			dataCreateThread = new ExecuteThread();
		}
		MarketRealDataVo mrdVo = new MarketRealDataVo();
		mrdVo.setSecucode(1);//证券代码
		mrdVo.setSecuname("平安银行");
		mrdVo.setClose(9.07f);
		initMarketDataList.add(mrdVo);
	}
	//开始产生实时数据
	public void createData(){
		dataCreateThread.start(); 
	}
    public double getBid(String symbol){
		return 0;
    }
    public double getAsk(String symbol){
		return 0;
    }
    
    class ExecuteThread extends Thread{
		@Override
		public void run() {
			while(true){
				for (Iterator iterator = initMarketDataList.iterator(); iterator.hasNext();) {
					MarketRealDataVo rldataVo = (MarketRealDataVo) iterator.next();
					String quotetime=Calendar.getInstance().getTime().toString(); 
					rldataVo.setQuotetime(quotetime);
					int code = rldataVo.getSecucode();
					String codeStr = "" + code;
					//System.out.println("股票代码：" + rldataVo.getSecucode() + ",行情时间：" + rldataVo.getQuotetime());
					RoundQueue<MarketRealDataVo> rq =null;
					if(marketDataRQ.containsKey(codeStr)){
						rq =marketDataRQ.get(codeStr);
						rq.pushLast(rldataVo);
					}else{
						rq = new RoundQueue<MarketRealDataVo>(mdrqSize);
						rq.pushLast(rldataVo);
						marketDataRQ.put(codeStr, rq);
					}
					try {
						this.sleep(33);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}
    }
}
