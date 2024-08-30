import java.util.Arrays;

public class demoArray2 {
  public static void main(String[] args) {
    /// example 11
    // refer to example 9
    // sorting
    // long[] arr13 = new long[] { 10, 3, -4, 9, 100, 70 }; // [-4,3,9,10,70,100]
    long[] arr13 = new long[] { -30,9070, -4, 900, 10, 1200 }; // [-4,3,9,10,70,100]

    // move the best value to the tail repeatedly
    long backup11 = -1;
    for (int i = 0; i < arr13.length - 1; i++) {
      for (int j = 0; j < arr13.length -i  - 1; j++) {
        if (arr13[j] > arr13[j + 1]) {
          // swap
          backup11 = arr13[j];
          arr13[j] = arr13[j + 1];
          arr13[j + 1] = backup11;
        }
        // System.out.println(Arrays.toString(arr13));
        System.out.println("Round i : " + i + " , Round j : " + j + " , " + Arrays.toString(arr13));

      }
    }

  }
}
