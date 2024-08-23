import java.math.BigDecimal;

public class Calculator {

  public double sum(double x , double y){
  BigDecimal x = new BigDecimal("2.1");
  BigDecimal y = new BigDecimal("3.4");

  double sum = x.add(y).doubleValue();


  }

  
  public static void main(String[] args) {
    //sum
    Calculator c = new Calculator();// object
    c.sum(3,5);
    
  }
  
}
