//package questions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array:       [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here ...
    // my_array = newArr;
    

    // arr[3]=120
      //int  indexPosition =  3
     // int newValue = 120
    
    int[] newArr =  Arrays.copyOf(my_array, my_array.length);
  

     newArr[indexPosition] = newValue;
     int backup =  indexPosition;
     
    
     for (int i = backup; i < newArr.length-1; i++){
        newArr [i+1] = my_array[i];
    
     }
     System.out.println("New Array: " + Arrays.toString(newArr));
    }
