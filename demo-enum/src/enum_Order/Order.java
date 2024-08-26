package enum_Order;
public class Order {
  //Iteme[] items;
  private Status status; //PAID, READY_TO_SHIP, SHIPPING, DELIVRED


   // constructor
 public Order (){
  this.items= new Item();
 }


  public void nextStatus(){
    this.status = this.status.next(); // -- Status line 31

  }

 public Status getStatus(){
    return this.status;
  }

  public void setStatus(Status status){
    this.status = status;
  }

  public static void main(String[] args) {
    Order order = new Order();
    
    order.setStatus(Status.PAID); // Validation

    System.out.println(order.getStatus());
    
    order.nextStatus();

    System.out.println(order.getStatus());


  


  }
}
