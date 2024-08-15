import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoforWhileLoop {
  
  public static void main(String[] args) {
    
    System.out.println("---for loop-----------------");
    int sum =0;
     for (int i = 0; i <5 ;i++){ // i--> conter <-----loop 5 times
      sum += i; // <---- i= 5 += 5 // print out 10
   }
   System.out.println(sum); //10

   System.out.println("-----while loop-----------------");
   //while loop
   int count = 0; 
   sum = 0;
   while (count<5){ // when count == 5, exit loop
     sum += count;     //<------ loop 1 ,2 ,3,4
     count++;         // <-----loop1 +1 +1 +1 +1 +1
    }
    System.out.println(sum); //10

    System.out.println("-----while loop TRUE-----------------");
    count = 0;
    sum = 0;
    while (true) { // by default infinite loop , it maybe 1000 time, 
      sum += count;
      count++;
      if (count > 4)  
      break;    //stop in 5th loop.
    }
    System.out.println(sum); //10




    System.out.println("-------------while loop check radom numer-----------------");
    // Random number
    int value = new Random().nextInt(5)+1; // <-----出 number 0-4 random value // + 1 <------ 出number 1-5 
    System.out.println(value);

    //Guess a number
    Scanner scanner = new Scanner(System.in); // <---- scanner input random number

    int number =- 1;
    while(number != value ){ // <------value != 唔等如同NUMBER 就繼續LOOP；
      System.out.println("Pleaes input a number between 1-5"); //<---- scanner 俾 user message
      number = scanner.nextInt(); // user input// <--- user 打number 
    }
       System.out.println("Congrats!!!!"); // <----搵 到number show message 
    

       System.out.println("-------------while loop change to Char Array-----------------");
       int code = 1234;
       //char [] codes = new char[]; // ['1','2','3','4']
      /// Approach 1
      //int -> Integer -> String -> char[1]
      char [] codes = new Integer(code).toString().toCharArray(); // <-----先將 int code 變成 Interger ，再轉做String .再轉成Char (用Method)
      System.out.println(Arrays.toString(codes)); // <---- print char[] 一定要用method Arrays. toString 

      // Approach 2
     // int a =0;
     // int arrLength= 0;
      //while (a>0) { //1234 
        //a =a /10;
        

      //<----- use while loop 唔知幾時完就用, 唔知有乜Value，加Break
      //<------ 加加 -- 生活上用 while loop 好用過for loop
      // reverse
      //char backup= ' ';
      //for (int i = 0; i < codes.length/ 2; i++);
      //backup = codes[i];
      //code[i] = codes[code.length - i -1];

    




  
    }
}
