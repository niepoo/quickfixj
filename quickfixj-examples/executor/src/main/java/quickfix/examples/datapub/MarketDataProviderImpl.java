package quickfix.examples.datapub;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import com.dbcon.base.util.SpringContextHolder;

import quickfix.examples.executor.MarketDataProvider;
import quickfix.examples.sevice.BaseDataService;
import quickfix.examples.vo.MarketRealDataVo;
/**
 * 市场数据服务提供
 * @author niepoo
 *
 */
public class MarketDataProviderImpl implements MarketDataProvider{
	static Timer timer = null;
	//实时行情对应循环队列
	public static Map<String,RoundQueue<MarketRealDataVo>> marketDataRQ = new HashMap<String,RoundQueue<MarketRealDataVo>>();
	public static final int mdrqSize = 1000;//环形队列的长度
	private static final int minFrequent = 1800;//每分钟的频率
	private static final int threadPoolSize  = 50;
	private static List<MarketRealDataVo> initMarketDataList = new ArrayList<MarketRealDataVo>();
	//构造执行线程
	public MarketDataProviderImpl(){
		try {
			ThreadPool.setPoolSize(threadPoolSize);
		} catch (ThreadPoolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BaseDataService baseDataService= SpringContextHolder.getBean(BaseDataService.beanId);
//		MarketRealDataVo mrdVo = new MarketRealDataVo();
//		mrdVo.setSecucode(1);//证券代码
//		mrdVo.setSecuname("平安银行");
//		mrdVo.setClose(9.07f);
//		initMarketDataList.add(mrdVo); 
		Map paramsMap = new HashMap();
		initMarketDataList = baseDataService.selectMarketList(paramsMap);
	}
	//触发产生实时数据
	public void beginCreateData(){
	    //设定指定任务task在指定延迟delay后进行固定频率peroid的执行。
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				String time=Calendar.getInstance().getTime().toString(); 
				//System.out.println(time + ":-------设定要指定任务--------");
//				if(initMarketDataList!=null&&initMarketDataList.size()>0){
//					int dataSize = initMarketDataList.size();
//					int stepLength = (int) Math.ceil(dataSize/threadPoolSize);
//					for(int fromIndex=0,toIndex=0;fromIndex<dataSize;fromIndex+=stepLength){
//						toIndex =  fromIndex + stepLength -1;
//						ThreadPool.enqueue(new DataRunnable(initMarketDataList.subList(fromIndex, toIndex<dataSize?toIndex:dataSize)));
//					}
//				}
				for (Iterator iterator = initMarketDataList.iterator(); iterator.hasNext();) {
					MarketRealDataVo curMRDataVo = (MarketRealDataVo) iterator.next();
					ThreadPool.enqueue(new DataRunnable(curMRDataVo));
				}
				
				
			}
			}, 1000, 1*60*1000/minFrequent);
	}
	/**
	 * 取消产生实时数据
	 */
	public void stopCreateData(){
		timer.cancel();
		ThreadPool.flush();
	}
    public double getBid(String symbol){
		return 0;
    }
    public double getAsk(String symbol){
		return 0;
    }
}
