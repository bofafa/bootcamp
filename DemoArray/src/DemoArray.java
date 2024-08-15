import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // 8 primitives + String
    int x = 3;
    int x2 = 6;
    int x3 = -4;

    int max = 0;
    if (x > x2) {
      if (x > x3) {
      } else {
        max = x3;
      }
    } else {
      if (x2 > x3) {
        max = x2;
      } else {
        max = x3;
      }
    }
    System.out.println("max=" + max); // 6

    // how about we compare 10 numbers?
    // you have to define the length of array before you use it.
    int[] arr = new int[3]; // 3 mean the length of array
    // assign the values to array
    arr[0] = 3;
    arr[1] = 6;
    arr[2] = -4;
    // print out all number from the array
    System.out.println(arr[0]);// 3
    System.out.println(arr[1]); // 6
    System.out.println(arr[2]); // -4
    System.out.println(arr.length); // 3


    // for loop -> print the values in array
    for (int i = 0; i < arr.length; i++) {// 0 1 2
      // System.out.println(i);
      System.out.println(arr[i]);// 3 6 -4
    }

    // _______________________________________
    // declare an array for double
    // for loop

    // double[] arr2 = new double[5];
    // arr[0] = 16.1;
    // arr[1] = 3.4d;
    // arr[2] = 2.8f;
    // arr[3] = -4.9;
    // arr[4] = 10;
    // arr[5]= 10.2

    // for (int i=0; i <arr.length; i++)
    {
      // System.out.println(arr2[i]);
    }
    // _________________________________________"


    System.out.println("--------Ex 1--- Find the max number from the Array--------");
    // Example 1
    int[] arr3 = new int[3];
    arr3[0] = 3;
    arr3[1] = 6;
    arr3[2] = -4;
    // Find the max num from the array
    // loop
    int maxNum = -2_100_000_000; // <-----------先定義 Max number
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > maxNum) {
        maxNum = arr3[i];
      }
    }
    System.err.println("max number =" + maxNum);

    // Find the min. number
    int minNum = 20000000;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] < minNum) {
        minNum = arr3[i];
      }
    }
    System.out.println("min numnber" + minNum);

    // Example 3
    String[] strings = new String[3];
    strings[0] = "abc";
    strings[1] = "hello";
    strings[2] = "12349000";
    String longestString = "";
    int maxLength = -1;

    // code here.....
    // string [i].length() --> a string balue lenght
    // string.lenght - > string array length
    for (int i = 0; i < strings.length; i++) {
      if (strings[i].length() > longestString.length()) {
        longestString = strings[i];

        System.out.println("the longest string=" + longestString);

      }
    }

    // Example 4
    double[] prices = new double[4];
    prices[0] = 10.3;
    prices[1] = 7.7;
    prices[2] = 1.5;
    prices[3] = 2.3;
    int[] quantities = new int[4];
    quantities[0] = 10;
    quantities[1] = 2;
    quantities[2] = 5;
    quantities[3] = 4;

    double totalAmount = 0.0;

    for (int i = 0; i < prices.length; i++) {
      totalAmount += prices[i] * quantities[i];
    }
    System.out.println("total amount:" + totalAmount);

    // Example 5
    // Average
    int[] scores = new int[5];
    scores[0] = 79;
    scores[1] = 70;
    scores[2] = 50;
    scores[3] = 100;
    scores[4] = 90;

    double totalScores = 0.0;
    double AverageScores = 0.0;

    for (int i = 0; i < scores.length; i++) {
      totalScores += scores[i];
    }

    System.out.println("Average Scores :" + totalScores / scores.length);

    // declare and intializa an array
    // approach 1
    String[] arr5 = new String[3];
    // approach 2
    String[] arr6 = new String[] { "abc", "def", "ijk" }; // lenght=3
    // approach 3
    String[] arr7 = { "abc", "def", "ijk" };// arr6[3];// error//
    // shortcut, ok but not to use this short cut

    // ***************Example 6****************
    int[] arr8 = new int[] { 100, -20, 40, 33, 90, 44, 66 };
    // Find all numbers that > 40 and divided by 4
    int[] answers = new int[7];
    int idx = 0;

    for (int i = 0; i < arr8.length; i++) {
      if (arr8[i] > 40 && arr8[i] % 4 == 0) {
        answers[idx++] = arr8[i];// ？？？？？
      }
    }
    System.out.println(Arrays.toString(answers));

    // Example 7
    // swap
    char[] arr9 = new char[2];
    arr9[0] = 'h';
    arr9[1] = 'a';
    char backup; // a new space for arr9 move around

    backup = arr9[0]; // h -> backup
    arr9[0] = arr9[1]; // a swap to h
    arr9[1] = backup;
    System.err.println(arr9[0]); // a
    System.out.println(arr9[1]); // h

    System.out.println("----------8--------------");

    // Example 8
    // loop + swap
    char[] arr10 = new char[] { '9', '4', '3', '2', '1', '0' };
    // move the first character to the tail
    // you cannot creat another array
    // {'9','4','3','2','1','0'}
    // {'4','9','3','2','1','0'}
    // {'4','3','9','2','1','0'}
    // {'4','3','2','9','1','0'}
    char backup1 = ' ';
    for (int i = 0; i < arr10.length - 1; i++) {// list the number out // jave.lang. ArrayIndexOutof BoundsException
                                                // 爆LOOP 要 -1
      backup1 = arr10[i]; // swap
      arr10[i] = arr10[i + 1];
      arr10[i + 1] = backup1;
      // i + 1 ////溫書
      // i - 1
      // i + 2

    }
    System.out.println(Arrays.toString(arr10)); // 4,3,2,1,0,9



    System.out.println("----------9--------------");

    // Example 9
    int[] arr11 = new int[] { 100, -100, -4, 5, -2, 200, 9 };
    // Move the max value to tail = {100, -100, -4, 5, -2, 9, 200}

    int maxvalue = -2_000_000_000; //// give max value a value first
    for (int i = 0; i < arr11.length; i++) { //// loop, find max value
      if (arr11[i] > maxvalue) { /// find max value
        maxvalue = arr11[i]; //// max value the last one
      }
    }
    System.out.println(maxvalue); // find max value, print out the last one

    int backup2 = -1; //// open a new room for backup
    for (int i = 0; i < arr11.length - 1; i++) { //// loop
      if (arr11[i] == maxvalue) { //// find the max value, then stop moving
        backup2 = arr11[i]; // //// arr
        arr11[i] = arr11[i + 1];
        arr11[i + 1] = backup2;
      }
    }

    System.out.println(Arrays.toString(arr11));

    System.out.println("--------Ex 10---sum Array  values ---------");

    //// example 10
    int[] arr12 = new int[] { 100, -100, -4, 5, -2, 200, 9 };
    // sum all values = 208
    int sum12 = 0;
    for (int i = 0; i < arr12.length; i++) {
      sum12 = sum12 + arr12[i];
    }
    System.out.println(sum12);
    System.out.println("-------11---------");


    System.out.println( "---------------Arrays sorting---?????----------------");
    Integer [] nums1 = new Integer[] {8,10,11,56};
    Integer [] nums2 = new Integer[] {57,88,98,41};
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    System.out.println( nums1);

    System.out.println( nums2);

    /// example 11
    // refer to example 9
    // sorting
    long[] arr13 = new long[] { 10, 3, -4, 9, 100, 70 }; // [-4,3,9,10,70,100]
    // move the best value to the tail repeatedly
    long backup11 = -1;
    for (int i = 0; i < arr13.length - 1; i++) {
      for (int j = 0; j < arr13.length - i - 1; j++) {
        if (arr13[j] > arr13[j + 1]) {
          // swap
          backup11 = arr13[j];
          arr13[j] = arr13[j + 1];
          arr13[j + 1] = backup11;
        }
        // System.out.println(Arrays.toString(arr13));
        System.out.println("Round i : " + i + "Round j : "+ j + " , " + Arrays.toString(arr13));

      }
    }

    System.out.println("-----------self test-------------------");
    // [-4,3,9,10,70,100]
    long minNum13 = +100000;
    long maxNum13 = -100000;

    for (int i = 0; i < arr13.length; i++) { // find max number
      if (arr13[i] > maxNum13) {
        maxNum13 = arr13[i];
      }
    }
    System.out.println(maxNum13); // max number 100
    long backup13 = 0;
    for (int i = 0; i < arr13.length - 1; i++) {
      if (arr13[i] == maxNum13) {
        backup13 = arr13[i]; //
        arr13[i] = arr13[i + 1];
        arr13[i + 1] = backup13;
      }
    }
    System.out.println(Arrays.toString(arr13)); // put max number in the end

    for (int i = 0; i < arr13.length - 1; i++) { // find min numer
      if (arr13[i] < minNum13) {
        minNum13 = arr13[i];
      }
    }
    System.out.println(minNum13);// find min number - 4
    long backup14 = 0;
    for (int i = 0; i < arr13.length - 1; i++) {
      if (arr13[i] == minNum13) {
        backup14 = arr13[0];//
        arr13[0] = arr13[i];
        arr13[i] = backup14;
      }
    }
    System.out.println(Arrays.toString(arr13));

    System.out.println(" ---------------- Default----------------");

    // default value for in[]
    int[] arr14 = new int[4];
    System.out.println(Arrays.toString(arr14)); // 0,0,0,0

    // default value for boolean[]
    boolean[] arr15 = new boolean[3];
    System.out.println(Arrays.toString(arr15)); // false, false, false

    // default value for char[]
    char[] arr16 = new char[3];
    System.out.println(Arrays.toString(arr16)); // , ,

    // default value for char[] /// what is \u0000????
    char[] arr17 = new char[3];
    arr17[0] = ' ';
    arr17[1] = '\u0000'; /// \u0000 = space // its a value look like spcae but \u0000 is not = space
    arr17[2] = ' ';
    System.out.println(Arrays.toString(arr17)); // , ,

    // string [], length 3
    // 2 ways to declare string array

    String[] arr18 = new String[] { "hello", "abc", "def" }; // fixed length 3
    System.out.println(arr18[1]); // abc
    arr18 = new String[4];
    // creat string array object (heap)
    // arr18 -> object Reference (variable)

    arr18[2] = "ijk"; // <---- give a new value in box 2
    // creat strig object, and assign string addres to one of tjhe addresses inside
    // the array.
    System.out.println(Arrays.toString(arr18)); // null, null , null , null <-- string default = null

    // ***********2D Array**************
    int[][] arr20 = new int[2][3]; // 2 rows (index 0,1) x 3 colums (0,1,2)
    arr20[1][1] = 100;
    arr20[1][2] = -99;
    arr20[0][1] = -1;
    // arr18[2][1] = 11; // error
    System.out.println(Arrays.deepToString(arr20));// [0, -1, 0], [0, 100, -99]

    System.out.println(arr20.length); // row length --> 2
    System.out.println(arr20[0].length); // column lenght ---> 3


    System.out.println( " --------------2D Array---------------");
    // for loop -> access 2D array
    for (int i = 0; i < arr20.length; i++) { // row -> 2
      for (int j = 0; j < arr20[0].length; j++) // colum ->3 -> reset
        System.out.println("[ " + i + "][" + j + "] , " + arr20[i][j]);

        }

        System.out.println( " --------------Find the Max count--------------");
    // Example 12
    int[] arr19 = new int[] { 9, 4, 2, 2, 3, 9, 3 };
    // Find the Max. count's value-> 9
    // find the number of 2=2
    int count = 0;
    for (int i = 0; i < arr19.length; i++) {
      if (arr19[i] == 2) {
        count++;
      }
    }
    System.out.println("the number of 2 =" + count);

    // given int value: 0 < x <9
    /*
     * int MaxValue12 = -100;
     * int[] arr21 = new int[] {9, 4, 2, 2, 0, 3, 9, 9,3};
     * // Find the Max. count's value-> 9
     * for (int i =0 ; i< arr21.length -1 ; i++){
     * if (arr21[i] > MaxValue12){
     * MaxValue12 = arr21[i];
     * }
     * }
     * System.out.println(MaxValue12);
     * 
     */

    // Given int value : 0 < x <9
    int[] arr23 = new int[] { 9, 4, 2, 2, 0, 3, 9, 9, 3 };
    // find the max. count's value -> 9

    // value --> index
    int[] counts = new int[10]; // 0-9 // ok -> 10 rooms
    for (int i = 0; i < arr23.length; i++) { // -> loop ok
      counts[arr23[i]]++; // count [arr21 ]
    }
    int max2 = 0;
    int target = -1;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > max2) {
        max2 = counts[i];
        target = i;
      }
    }
    System.out.println("the max count value is " + target);
    ////// example 0-99, same as above
    int[] counts1 = new int[10]; // 0-99
    for (int i = 0; i < arr23.length; i++) {
      counts[arr23[i]]++;
    }
    int max3 = 0;
    int target2 = -1;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > max3) {
        max3 = counts[i];
        target2 = i;
      }
    }
    System.out.println("the max count value is " + target2);
    System.out.println("----------loop------------");
    //// loop///

      //exaple 1//
      //Arrays.copyof()
      // problem
      //arr4 -> obj ref
      // int array object

      int [] arr4 = new int[]{1,2,3};
      arr4 = new int[] {2,3,4};
      
      //we have 2 object reference, but one object
      int[] arr21 = new int[] {1,2,3};
      int [] arr22 = arr21; // Pass by reference
      System.out.println(arr22[2]); //3
      System.out.println(arr21[2]); //3

      arr21 [1] = 100; // <----- 改資料 ARRAY 第二格 改做100 ，arr21 =  1, 100, 3
      System.out.println(arr21[1]); //100
      System.out.println(arr21[1]); //100

       //how to backup Array?
      //Arrays.copyOf()
      // Heap memory --> create another int array
      int [] backupArray = Arrays.copyOf (arr21, arr21.length); //define the length of new Array
      System.out.println(Arrays.toString(arr21));

      //example 2
      int x1 = 10;
      int x4 = x1; // pass by value
      System.out.println(x4); //10

      //example 3
      String s1 = "abc";
      String s2 = s1; // pass by value
      s1 = "def";
      System.out.println(s1); //def
      System.out.println(s2); //abc

      //Conclusion
      //8 Primitives + 8 Warapper Classes + String - > pass by value
      // other than that -----> pass by reference

      //For Pass by reference ---> you can refer to example 1.
      // for Pass by value - -----> you can refer to example 2 and 3.


      System.out.println("-------------bubble sort / Insertion sort--------------");
      //Bubble sort / Insertion Sort (Nested Loop)
     int[] beforeSort =  new int [] {30,-3,100,-102};
     Arrays.sort(beforeSort); // Performance: nlogn
     System.out.println(Arrays.toString (beforeSort)); //<----- pass by reference 





 
  }
}
