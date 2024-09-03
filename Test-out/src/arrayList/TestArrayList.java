package arrayList;
import java.util.ArrayList;
import java.math.BigDecimal;
public class TestArrayList {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<String>();
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Orange");
      fruits.add("Mango");

      //Exercise 1
      System.out.println(fruits); //[Apple, Banana, Orange, Mango]

      // Exercise 2
      System.out.println(fruits.get(2)); //Orange

      fruits.set(1,"Grapes");
      System.out.println(fruits);//[Apple, Grapes, Orange, Mango]


      // Exercise 3

     fruits.remove("Orange");
     System.out.println(fruits.contains("Orange"));
     System.out.println(fruits);

  //Exercise 4
    ArrayList<Integer> numbers = new ArrayList<>();
     numbers.add(5);
     numbers.add(10); 
     numbers.add(15);
     numbers.add(20);       

     int sum =0;
     for (int number : numbers){
       sum += number;
     }

     System.out.println(sum);


     //Exercise 5
     System.out.println(fruits.contains("Apple"));
     System.out.println(fruits.indexOf("Mango"));
     System.out.println(fruits);


     System.out.println("Exercise 1: ArrayList Manipulation" );
     ArrayList<BigDecimal> prices = new ArrayList<>();
     prices.add(new BigDecimal("10.99"));
     prices.add(new BigDecimal("5.75"));
     prices.add(new BigDecimal("20.50"));

     BigDecimal sum3 = BigDecimal.ZERO;
     for (BigDecimal price : prices) {
         sum3 = sum3.add(price);
     }
       System.out.println(sum3);//37.24

       BigDecimal average = sum3.divide(new BigDecimal(prices.size()), 2, BigDecimal.ROUND_HALF_UP);
       System.out.println("Average price: " + average);
     }
    }
  


  


