public class JavaQuest4 {
  public static void main(String[] args) {
    
    //package questions;

  //**
   //* Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3
   //* and divisible by 2 (Search it from 1)
   //* 
   //* Expected Output: 6 12 18 24 30 36 42 48 54 60

    // Print the first 10 numbers from 0:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. > 0

    int count2 = 0;
     for ( int i =0 ; i < 61 ; i++){
      if( i % 2 == 0 && i % 3 == 0 && i >0){
      System.out.println("" + i +  " ");
      count2++;
      if (count2  == 10)
      break;
     }
    }
  }
}



    //int count =0;
   // for (int i = 0; i < 100; i++) { // You cannot change this line
    //  if (i % 2 == 0 && i % 3 == 0 && i > 0) {
    //    System.out.print("   " + i + "   ");
    //    count++;
   //     if (count == 10)
   //     break;
      
    
  

