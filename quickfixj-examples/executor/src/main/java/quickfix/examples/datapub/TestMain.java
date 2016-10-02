package quickfix.examples.datapub;

public class TestMain {
 
    public static void main(String[] args) {
        RoundQueue<Integer> queue=new RoundQueue<Integer>(10000);
         
        /* 添加数据 */
        for(int i=0;!queue.isFull();i++){
            queue.addLast(i);
        }
        queue.pushLast(110000);
        System.out.println(" getTail :>"+queue.getTail());
         
        System.out.println(" 1 indexOf :>"+queue.indexOf(1));
        System.out.println(" real size before :>"+queue.realSize());
        System.out.println(" first element :>"+queue.removeFirst());
        System.out.println(" real size after:>"+queue.realSize());
         
        if(!queue.isFull())  queue.addLast(10);
        queue.pushLast(1242);
        System.out.println(" getTail :>"+queue.getTail());
        /*遍历结果*/
        while(!queue.isEmpty()){
            System.out.println(queue.removeFirst());
        }
         
     
    }
 
}