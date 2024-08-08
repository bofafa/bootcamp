import java.util.Scanner;

public class DemonScanner {
  public static void main(String[] args) {
    //user input
    //Example 1
    Scanner s = new Scanner(System.in);
    System.out.println("Please put a number:");

    int input = s.nextInt();
    //terminal will stop at "s.nextint()", and wait for a user input
    //after capturing the user input -> assignment

    if (input % 2 ==0){
      System.err.println("the user input even number"); 
      } else {
        System.err.println("the user input odd number"); 
      }
    

    //the user input is an odd number
    // the user input is an even number

    // Example 2


    // "Choose an option: 1) Deposit 2)Withdrawl 3) Check balance"
    // if user input 1
     // Question -> "Please input the deposit amount:"
       //Print out the amount of Deposit
    // if user input 2
     // Question -> "Please input the withdraw amount:"
       // Print out the amount after withdrawl
    //if user input 3
     // Print out current balance

     double currentBalance = 300.0;

     Scanner s1 = new Scanner(System.in);
     System.out.println("Please press 1) Deposit, 2) withdraw, 3) check balance");
     int option = s1.nextInt();
 
     if (option == 1) {
       System.out.println("Please input the deposit amount");
       double depositAmount = s1.nextDouble();
       System.out.println("Your current balance is " + (currentBalance + depositAmount));
     } else if (option == 2) {
       System.out.println("Please input the withdraw amount");
       double withdrawAmount = s1.nextDouble();
       System.out.println("Your current balance is " + (currentBalance - withdrawAmount));
     } else if (option == 3) {
       System.out.println("Your current balance is " + currentBalance);
     } else {
       System.out.println("Please enter the correct options number");}
      

    }
    }

    



