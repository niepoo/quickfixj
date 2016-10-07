package quickfix.examples.datapub;

import java.util.Iterator;
import java.util.Map;

import quickfix.examples.vo.MarketRealDataVo;

public class TestMain {
 
    public static void main(String[] args) {

        MarketDataProviderImpl marketData = new MarketDataProviderImpl();
        marketData.beginCreateData();
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //marketData.stopCreateData();
        /*遍历结果*/
        while(!MarketDataProviderImpl.marketDataRQ.isEmpty()){
        	Map map = MarketDataProviderImpl.marketDataRQ;
//        	for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
//				String code = (String) iterator.next();
				RoundQueue<MarketRealDataVo> rq = (RoundQueue<MarketRealDataVo>) map.get("4");
				try{
				MarketRealDataVo vo = rq.removeFirst();
				if(vo!=null){
					System.out.println("查询结果****股票代码：" + vo.getSecucode() + ",行情时间：" + vo.getQuotetime());

				}
				Thread.sleep(30);
				}catch(Exception e){
					
				}
//			}
//        	try {
//    			Thread.sleep(6000);
//    		} catch (InterruptedException e) {
//    			// TODO Auto-generated catch block
//    			e.printStackTrace();
//    		}
//            marketData.beginCreateData();
           // System.out.println(queue.removeFirst());
        }
    }
}
