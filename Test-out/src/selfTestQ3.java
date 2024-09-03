import java.util.Scanner;

public class selfTestQ3 {

 public static void main(String[] args) {
  
 

  /**
   * Expected Output:
   * 
   * Example 1:
   * Input a month number: 2 
   * Input a year: 2016 
   * 
   * February 2016 has 29 days
   * 
   * Example 2:
   * Input a month number: 12 
   * Input a year: 2014 
   * 
   * December 2014 has 31 days
   */
  
   // Program the number of days that the month of a year has.

    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();

    // Complete the switch statement
    switch (month) {
      case 1:
        monthOfName = "January";
        System.out.println( "January " + year + "has 31 days");
        break;
        // Code here ...
      case 2:
        monthOfName = "February";
        // The February has 29 days: (Every 4 years and the year cannot divded by 100)
        // or The year can divided by 400
        // otherwise the February should have 28 days only
        // how about other months, December?
    }
    System.out.println(
        monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
  

  }
  
}
 