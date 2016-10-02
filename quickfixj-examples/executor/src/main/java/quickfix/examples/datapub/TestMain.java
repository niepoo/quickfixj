package quickfix.examples.datapub;

import java.util.Iterator;
import java.util.Map;

public class TestMain {
 
    public static void main(String[] args) {
//        RoundQueue<Integer> queue=new RoundQueue<Integer>(10000);
//         
//        /* 添加数据 */
//        for(int i=0;!queue.isFull();i++){
//            queue.addLast(i);
//        }
//        queue.pushLast(110000);
//        System.out.println(" getTail :>"+queue.getTail());
//         
//        System.out.println(" 1 indexOf :>"+queue.indexOf(1));
//        System.out.println(" real size before :>"+queue.realSize());
//        System.out.println(" first element :>"+queue.removeFirst());
//        System.out.println(" real size after:>"+queue.realSize());
//         
//        if(!queue.isFull())  queue.addLast(10);
//        queue.pushLast(1242);
//        System.out.println(" getTail :>"+queue.getTail());
//        /*遍历结果*/
//        while(!queue.isEmpty()){
//            System.out.println(queue.removeFirst());
//        }
         
     
        MarketDataProviderImpl marketData = new MarketDataProviderImpl();
        marketData.createData();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        /*遍历结果*/
        while(!MarketDataProviderImpl.marketDataRQ.isEmpty()){
        	Map map = MarketDataProviderImpl.marketDataRQ;
        	for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
				String code = (String) iterator.next();
				RoundQueue<MarketRealDataVo> rq = (RoundQueue<MarketRealDataVo>) map.get(code);
				try{
				MarketRealDataVo vo = rq.removeFirst();
				if(vo!=null){
					System.out.println("股票代码：" + vo.getSecucode() + ",行情时间：" + vo.getQuotetime());

				}
				Thread.sleep(100);
				}catch(Exception e){
					
				}
			}
           // System.out.println(queue.removeFirst());
        }
    }
}
