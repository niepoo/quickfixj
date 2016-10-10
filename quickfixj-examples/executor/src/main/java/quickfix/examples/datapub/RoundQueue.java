package quickfix.examples.datapub;

import java.io.Serializable;
import java.util.NoSuchElementException;
 
 
/**
 * @author niepoo
 */
public class RoundQueue<T> implements Serializable{
     
    private static final long serialVersionUID = -873109114121357176L;
     
    private T[] queueArray;
    private int qhead=0;
    private int qtail=0;
    private int qrealSize=0;//实际容量
     
    //初始的大小为10
    @SuppressWarnings("unchecked")
    public RoundQueue(int size){
        queueArray=(T[])new Object[(size<=0) ? 10 : size];
    }
     
    /**
     * 向尾部添加一个元素
     * @param element
     */
    public void addLast(T element){
        if(isFull()){
            throw new NoSuchElementException();
        }
        qtail=(qhead+qrealSize)%queueArray.length;
        queueArray[qtail]=(T) element;
        qrealSize++;
         
    }
    /**
     * 向尾部添加一个元素,队列满时将队列头溢出
     * @param element
     */
    public void pushLast(T element){
        if(isFull()){
            this.removeFirst();
        }
        qtail=(qhead+qrealSize)%queueArray.length;
        queueArray[qtail]=(T) element;
        qrealSize++;
         
    } 
     
    /**
     * 移出第一个元素
     * @return int
     */
    public T removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
         
        T tempLog=queueArray[qhead];
        queueArray[qhead]=null;
        qhead=(qhead+1)% queueArray.length;
        qrealSize--;
         
        return tempLog;
    }
    /**
     * 获取第一个元素
     * @return int
     */
    public T getFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        T tempLog=queueArray[qhead];
        return tempLog;
    }  
    
   /**
    * 获取队列尾的一个元素
    * @return int
    */
   public T getTail(){
       if(isEmpty()){
           throw new NoSuchElementException();
       }
       T tempLog=queueArray[qtail];
       return tempLog;
   }
     
    /**
     * 队列真实的数量
     * @return int
     */
    public int qrealSize(){
        return qrealSize;
    }
     
     
    /**
     * 队列是否为空
     * @return boolean
     */
    public boolean isEmpty() {
        return qrealSize() == 0;
    }
     
    /**
     * 队列是否已满
     * @return boolean
     */
    public boolean isFull()
    {
        return qrealSize()==queueArray.length;
    }
     
    /**
     * 清除保存的所有数据
     */
    public void clear(){
        while(!isEmpty()){
            removeFirst();
        }
    }
     
    /**
     * 返回指定位置的值
     * @param index
     * @return int
     */
    public T get(int index){
         if (index < 0 || index >= qrealSize)
         {
             throw new IndexOutOfBoundsException("Index: "+index+ ", Size: "+qrealSize);
         }
         
        return queueArray[index];
    }
    /**
     * 获取元素在队列中的索引,找到就返回其位置，找不到就返回-1
     * 如果key为null.则永远返回-1
     * @param elementy要查找的元素
     * @return int
     */
    public int indexOf(T key){
         if (key==null) {
            return -1;
         }else{
             int index = 0;
             while(index<=qrealSize()-1){
                 if(key.equals(queueArray[index]))
                     return index;
                 index++;
             }
         }
         
        return -1;
    }
}