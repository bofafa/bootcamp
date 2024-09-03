import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  
  public static void main(String[] args) {
    //for PQ, it is Not first come first serve. 
    Queue<String> pq= new PriorityQueue<>();//< -- create new PriorityQueue
    pq.add("abc");
    pq.add("hello");
    System.out.println(pq); //[abc, hello]
    pq.add("def");
    System.out.println(pq); //[abc, hello, def] ->it is not the queue order....
    pq.add("aaa");
    pq.add("bca");
    pq.add("bac");
    System.out.println(pq);

   //!!! The Algorithm pick th firswt element at poll(), but not exactly a sorting. (只抽第一粒，後面無排到)
  //but the actul ordering of the queue is
   System.out.println(pq.poll()); //aaa  // pq make order when it poll, if only find the first one, it wont make the actal order of the list
   System.out.println(pq);         //[abc, bca, bac, hello, def]
   System.out.println(pq.poll()); //abc
   System.out.println(pq.poll()); //bac
  }
}
