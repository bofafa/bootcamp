//public package questions;

import java.util.Arrays;

/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
  //  int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax = 0;
    // code here ...
    // 1.find the first line max number
    // 2.find the first line 2nd max number
    // 3.

    int MaxNum = -20000000;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > MaxNum) {
        MaxNum = nums[i];
      }
    }
    System.out.println(MaxNum);

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == MaxNum) {
        continue;

      }
      if (nums[i] > secondMax) {
        secondMax = nums[i];
      }
    }
    System.out.println(secondMax);

  }
}