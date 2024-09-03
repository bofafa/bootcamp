package linkedlistDemo;

import java.util.LinkedList;
import java.util.List;

public class Node {
  private Node next;
  private Customer customer;
  //similar to Box
  // List<Customer> = new LinkedList<Customer>();
  // Customer.class -> name, age

public Node (Customer customer){
this.customer = customer;
}

    public Node (Customer customer, Node next){
      this.customer= customer;
      this.next = next;
    }

    @Override
      public String toString(){
        Node head = this;
        StringBuilder sb = StringBuilder ("Customer [");
        while (head != null){
          sb.append(head.getCustomer());
          head = head.next;
          sb.append(",");

        }
        return sb.deleteCharAt(0)
      }
  public static void main(String[] args) {


    List<Customer> customerList= new LinkedList<Customer>();

    Customer c1 = new Customer("John", 30);
    Customer c2 = new Customer("Roy", 27);
    Customer c3 = new Customer("May", 50 );
  
    customerList.add(c1);
    customerList.add(c2);
    customerList.add(c3);
    
      //System.out.println(c1); <-- test
    //customerList.add(new Customer ("BBB", 30)); <-- method of add customer, no c1 c2 c3
    System.out.println(customerList); //<---- the full list of linkedListed
  }


}
