package loop;
import java.util.ArrayList;
public class StudyLoop {
  //int i= 0 <-----由邊度開始？
  // i < 8 <------- 要LOOP 幾多次？？ 
 // i++ <------- 將第一次LOOP 到嘅 VALUE 再 ＋ 1 
  public static void main(String[] args) {
  
    // example 1
    System.out.println("---------loop------ how to mutiply with input number------------------ ");
   int number = 5;
    for (int i =1 ; i <=10 ; i ++){
    System.out.println(number + "X" + i +"=" + (number * i));
   }
    //5X1=5
    // 5X2=10
    // 5X3=15
    // 5X4=20
    // 5X5=25
    // 5X6=30
    // 5X7=35
    // 5X8=40
    // 5X9=45
   // 5X10=50


   //example 2
   System.out.println("------------sum number 1 to 100------------------ ");
   int sum = 1; // <---- 先定義 要loop 乜？ here we need sum, name sum
   for (int i =0 ; i <= 100 ; i++){
   sum += i;
   }
   System.out.println(sum); // 5051

    //example 3
    System.out.println("------------nested loop---------------- ");
    int row =5;
    for (int i = 1 ; i<=row; i++ ){     // 
      for (int j = 1 ; j <= i ; j++){  //< loop 1 time, j = i, print out 1. loop 2 times, print out 2 times, 1 2
        System.out.print( j + " "); // <--- can not print pattern because println "print line" , remove ln for printing in the same line.

      }
      System.out.println();
    }
    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4 
    // 1 2 3 4 5 

     //example 4

    int n = 10;
     System.out.println("----------Fibonacci Sequence up to " + n + " terms---------");
     int firstTerm = 0; 
     int secondTerm =1;
  
         
          for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm; 
            //0 1 1 2 3 5 8 13 21 34


  }

   //example 5
   System.out.println("----------Prime Number---------");
         int number3 = 17;
        boolean isPrime = true; 

        if (number3 <=1 ){
          isPrime = false;
          }else{
            for (int i = 2 ; i <= Math.sqrt(number3); i++){
              if(number3 % i == 0){
                isPrime = false;
                break;
              }
            }
            }
            if (isPrime) {
              System.out.println(number3 + " is a prime number.");
          } else {
              System.out.println(number3 + " is not a prime number.");
          }

   //example 6
   System.out.println("---------- Find the index of a specific character in a string---------");       
   String text = "Hello, World!";
   char targetChar = 'o';
   int foundIndex = -1;

   for (int i = 0; i < text.length(); i++) {
       if (text.charAt(i) == targetChar) {
           foundIndex = i;
           break; // Exit the loop once the target character is found
       }
   }

   if (foundIndex != -1) {
       System.out.println("The character '" + targetChar + "' is found at index: " + foundIndex); //<-- must put a string in between, other java will give you ascii
   } else {
       System.out.println("The character '" + targetChar + "' is not found in the text.");
   }

// example 7
System.out.println("---------- Search for a specific element in an array---------");  
  int [] arr = {10, 20, 30, 40, 50};
  int testNumber = 30;
  boolean found = false;
   
  for(int i = 0 ; i < arr.length; i++){
    if(arr[i] == testNumber){
      found = true;
      break;
    }
  }
    if(found){
      System.out.println("Test number '"+ testNumber + "' is found" );
    }else{
      System.out.println("Test number '"+ testNumber + "'is not found" );
    }


// example 7
    System.out.println("---------- Search for a specific string in a Array list---------");  
     ArrayList<String> fruits = new ArrayList<String>();
      fruits.add("apple");
      fruits.add("orange");
      fruits.add("banana");
      fruits.add("kiwi");  
      fruits.add("apple");

       System.out.println(fruits.size()); //4 // .size = the total array object

      fruits.set(1, "blueberry");  // .set = replce the index of object (inx, object name)
       System.out.println(fruits); //[apple, blueberry, banana, kiwi]

       fruits.remove("apple"); // .remove = remove a item in arraylist
        System.out.println(fruits); 

        fruits.get(3);
         System.out.println(fruits.get(3));// .get = Array list index

          String targetFruit = "apple";
          boolean found2 = false;

         for (int i = 0 ; i <fruits.size() ; i++ ){
          if (fruits.get(i) == targetFruit){
           found = true;
            break;
           }       
           }

           if (found){
            System.out.println( targetFruit + " is found");
            }else{
             System.out.println(targetFruit + " is not found");
   }


   }

  }


   
  