import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//Queue, 先到先得系統，排隊用及 一定需要有公平時候用 如 audit, 極致時先用
// 做完個task 就走，唔會留定
// if you need to use loop, you should not use Queue

public class DemoQueue {
  public static void main(String[] args) {
    // LinkedList (Queue vs Deque vs List)
    Queue<String> queue = new LinkedList<>();
    // 10000 lines ....
    queue.add("abc"); // Collection method
    queue.add("def"); // Collection method
    queue.add("ijk"); // Collection method
    System.out.println(queue.size()); // 3, Collection method

    String removedString = queue.remove(); // remove head element
    System.out.println(queue); // [def, ijk]
    System.out.println(removedString); // abc

    queue.remove("ijk"); // [def] (for loop)
    System.out.println(queue);

    // LinkedList object determined add() -> addLast()
    // ArrayDeque object determined add() -> addLast()

    //
    //You may use"instramceOf" for checking
    //usually we check the same type of instance before downcast
    //ie if (queue instanceOf Deque) {}
    Deque<String> deque = (Deque) queue;
    deque.addFirst("jjj");
     System.out.println();

     Deque <String> deque2 = new ArrayDeque<>();
     Queue <String> deque3 = new ArrayDeque<>();

       //poll()
     String head = queue.poll();//  similar to  "remove"
     System.out.println(head); //jjj
     System.out.println(queue);// [def]

     // peek()
     String head2 = queue.peek(); // look up the head element
     System.out.println(head2); //def
     System.out.println(queue); // [def] still exit

     // while loop
        queue.add("vicemt");
        queue.add("Jenny");
        queue.add("Oscar");
       System.out.println(queue.size());//4

      // look up th queue (likely you wont loop the queue element)
      // instead, you may consider using list if you treat it as a simple date collection
      for (String s :queue){
        System.out.println(s);
      }


      //contains , look up the queue 
      System.out.println(queue.contains("Vincent")); //true
      System.out.println(queue.contains("Katie")); //false

      //testing
      String element;
      int count = 0;
      while(true){
      element = queue.poll();
      queue.add(element);
      if (++count >5) break;
      

      }

       //For each
       String element2;
       while(!queue.isEmpty()){ //<--- this is list empty?
        element= queue.poll();
        System.out.println(element);
       }
       System.out.println(queue);

       //As a Developer, you can choose the Interface and the implementation separeately
     //1.Queue -> LinkdList or  ArrayDeque
     //2.Deque -> LinkList or ArrayDeque
     //3.List -> LinkedList or ArrayLists

     //Choose betweem Queue, Deque, List
     //1. Alll the above have ordering
     //2. Queue the above have ordering
     //3. Deque addFist, removeList
     //4. Queue and Deque for consumption


  }
}