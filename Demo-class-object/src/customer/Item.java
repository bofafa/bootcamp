package customer;

import java.math.BigDecimal;

//1. attributes
public class Item {                      //<-----attributes  Item 
  private double price;
  private int quantity;

  // constructor
  public Item(double price, int quantity) { //<------ constructor, item (要有PRICE AND Qty)
    this.price = price;
    this.quantity = quantity;
  }

  // getter, setter                   { //<------ only getting here
  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {          
    return this.quantity;
  }

  // Not a must to use BigDecimal (double * int) <----- 有點數時要用BigDecimal
  public double subtotal() {
    // int * double -> 1.0 * 0.2
    // double * double -> 0.1 * 0.2
    BigDecimal total = BigDecimal.valueOf(0);
    total = BigDecimal.valueOf(this.price) //
        .multiply(BigDecimal.valueOf(this.quantity));
    // multiply() -> return a new BigDecimal Object
    return total.doubleValue();
  }

  public static void main(String[] args) {
    int x = 2; // 2.0
    double y = 0.2;
    System.out.println(x * y);
    System.out.println(x + y);
    System.out.println(x - y);
  }
}