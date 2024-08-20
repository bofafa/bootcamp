

public class Customer {
  private int age;

  public Customer (int age) {
  this.age =age;
  }

  public void setAge (int age){
    this.age = age;

    public boolean isElderly(){
      this.age >= 66;
    }
 }
  
 public static void main(String[] args) {
   Customer customer = new Customer(66);

   //for void method, there is no return value.
   // system.out.println (customer.setAge(70)); //!

   customer.setAge (70);
   System.out.println(customer.isElderly());

   //is Elderly() is better design, because
   //1. method is for accracy running repeatedly
   //2. readability

 }
}
