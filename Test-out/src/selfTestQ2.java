
//package questions;
/**
 * Expected Output:
 * 
 * a > 9
 * str length < 27
 * 2020 is a leap year.
 * 2400 is a leap year.
 */
// Primitive types and operators


/**  System.out.println("I am going to add two numbers together:");
    int first = 31;
    // declare the second one
    // code here ...

    System.out.println("The first one: " + first);
    System.out.println("The second one: " + second);

    // Add two numbers and print it out
    // code here ...
    System.out.println("The sum is " + sum);

    // subtraction
    // code here with tips, pls fix ...
    // subtract = first - second
    System.out.println("The subtraction reuslt is " + subtract);

    // another sum
    byte b1 = 60;
    byte b2 = 70;
    // code here with tips, pls fix ...
    // sum = b1 + b2;
    System.out.println("The another sum reuslt is " + sum);

    // declare two boolean variable with true and false value
    // code here
    System.out.println("The variable varB is " + varB);
    System.out.println("The variable varC is " + varC);

    // Reading Example
    float fnumber = -130.20f; // By default, numbers are treated as double in Java.
    // Use suffix 'f' with value to make it float.
    double dnumber = -20.50;
    System.out.println("The variable fnumber is " + fnumber);
    System.out.println("The variable dnumber is " + dnumber);

    // Find reminder. Declare variable a & reminder
    int a = 7;
    int b = 3;
    // Fix it ...
    int reminder = a - b;
    System.out.println("The variable reminder is " + reminder);

    // declare a variable x and assign value to it.
    int e = 7;
    int o = 8;
    int y = 4;
    // code here ... define the x and assign value to it
    int result = e - o * x / y;
    System.out.println("The result is " + result);
  }
} */
public class selfTestQ2 {
  public static void main(String[] args) {

    int a = 10;
    int b = 3 * a % 3;
    if (a == 9) {
      System.out.println("a is equals to 9");
    } else if (a<9 ) {
      System.out.println("a is between 0 and 8");
    // how about a > 9?
    } else {
      System.out.println("a > 9");
    }

    String str = "I love Java. I love coding";
    if (str.length()==27) {
      System.out.println("str length=27");
    } else if (str.length() < 27) { // code here ... add the condition
      System.out.println("str length < 27");
    } else if (str.length() > 27) { // code here ... complete the code
      System.out.println("str length > 27");
    }
    //2020 is a leap year.
    //2400 is a leap year.

     // condition
    // Leap Year
    //1. Divided by 4
    //2. Not Divided by 100
    //3. or divided by 400

    int year = 2400;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
    System.out.println(year + " is a leap year.");
    }else{
    System.out.println( year + " is not a leap year.");}



  }
}
