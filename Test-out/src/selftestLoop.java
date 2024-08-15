import java.util.Arrays;

public class selftestLoop {
  public static void main(String[] args) {

    System.out.println("--------------for loop ;  ok get 到 YAY-------------");
    /// about loop////
    // Loop 點用？？？？？？
    /// 需重復輸出或輸入指令：
    // int i= 0 <-----由邊度開始 （RUN/計)？
    // i < 8 <------- 要LOOP 幾多次？？
    // i++ <------- 將第一次LOOP 到嘅 VALUE 再 ＋ 1

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
    // print out:
    // 0 <------ 0 開始係因為 i = 0
    // 1 <------- Print 到1 出嚟， 因為 i++ ， 第一次LOOP "0" ＋ 第二次LOOP "1" = 1
    // 2 <--------Print 到2 出嚟， 因為 第二次LOOP "1" + 1 = 2
    // 3 <---------Print 到3 出嚟， 因為 第三次LOOP "2" + 1 = 3
    // 4 <----------- print 到4， 因為 i< 5 , 只LOOP 5 次 ， 第四次LOOP "3" + 1 = 4

    System.out.println("------------- For loop SUM 總和 ;  ok get 到 YAY---------------");
    // 1＋2＋3＋4＋5 加總
    int total = 0; // <--- 先俾 TOtAL 一個 VALUE
    for (int i = 1; i <= 5; i++) { // <------- i = 1 因為由1 開始加 ； 1 <= 5 因為LOOP五次； i++ 每次LOOP 再加一
      total = total + i; // <----------- i = 1,2,3,4,5 加 ＋ 等如將 i += 1+2+3+4+5
    }
    System.out.println(total); // 15 <-- total

    System.out.println("------------- For loop Continue ;  ok get 到 YAY--------------");
    // continue <-----skip the value in the loop
    // find the even number from 0-10
    // print out 0,2,4,6,8,10
    for (int i = 0; i < 11; i++) { // 注意括號！ i = 0 由 0 開始RUN ；i<=10 即係 LOOP 11次 ; i++ Loop value 加1
      if (i % 2 == 1) { // 注意括號！ if 係加條件，如果LOOP 個 VALUE (即係 i) 除而 2 係有餘數1 即係單數
        continue; // continue 係停止指令，if 係 單數就唔會SHOW出嚟同埋會即刻回彈返去FOR LOOP 繼續做下一個 LOOP指令
      }
      System.out.println("print out:" + i); // print out: 0，2，4，6，8，10 //所以只Print OUT 到even number, 單數係continue 時SKIP 晒
    }

    System.out.println("------------- For loop Break ; ok get 到 YAY--------------");
    // break <------ stop the loop
    // 1-100, print out 1-5 only
    for (int i = 1; i < 100; i++) { // <----- loop 100 times
      if (i == 6) { // if 係加條件，如果loop value = 6
        break; // loop 到6 就停
      }
      System.out.println(i); // Print out 5
    }

    System.out.println("------------- For loop  + Array ; ok get 到 YAY-------------");
    // Array [] < -- ok
    // loop array
    // find avg student scores
    int totalScore = 0;
    int avg = 0;
    int[] grades = new int[] { 66, 77, 88, 99, 90, 35, 55, 65, 88, 97 };// <---先訂義 Array 同 改"名" 呢度叫個Array做 "grades" it
                                                                        // can be int, double, byte, char... depend on
                                                                        // value etc

    for (int i = 0; i < grades.length; i++) { // <-----loop 個 Array 搵總數
      totalScore = totalScore + grades[i];// <--TotalScore 先定義係int, 放括號外 (line 59)// grades[i] 係代表 Array 嘅資料
      avg = totalScore / grades.length;// <--- avg 先定義係int, 放括號外 (line 60)
    }

    System.out.println("total score = " + totalScore);// 搵answer = 760 // its total array value
    System.out.println("avg score =" + avg); // 搵answer = 76// is avg value of array

    System.out.println("grades length =" + grades.length); // <---- print out 10 // .length 是 Array 嘅 length 即係上面Array
                                                           // 有7 樣野 （it can be a very large number, so we better use
                                                           // .length of Array)
    System.out.println("grade position 6 value =" + grades[5]); // <---- print out 35// grades [5] 係 Array 第6 格，第6格
                                                                // value係 35
    System.out.println("grade info =" + Arrays.toString(grades)); // <-- print out [66, 77, 88, 99, 90, 35, 55, 65, 88,
                                                                  // 97] Array info // Arrays.toString(Array嘅名即係grades)

    System.out.println("------------- For loop  + Array ; find biggest number -------------");

    int[] arr8 = new int[] { 100, -20, 40, 33, 90, 44, 66 };
    // Find all numbers that > 40 and divided by 4
    int[] answers = new int[7]; // <--- 先俾D empty 房佢放sort out number 上面有7個number 所以俾7間房
    System.out.println("start : " + Arrays.toString(answers)); // <--- 100, 44, 0,0,0,0

    int idx = 0; // <---idx is 0

    for (int i = 0; i < arr8.length; i++) { // <---- loop 第一次 ＝所有數字 list 出嚟
      if (arr8[i] > 40 && arr8[i] % 4 == 0) { // <--- 俾條件佢loop: number 要大過40 && 4可除盡 // arr8[i] 等如Array 第i間房 即line 78
        answers[idx++] = arr8[i];// < ---- 必需要俾房佢sort out, 由0位置開始 放number // arr8[i] ＝條件後嘅 list, 每個number,
                                 // 對返入indx++ 入房
        // idx++ -> 0 , 1 , 2 ....
        System.out.println("in loop : " + Arrays.toString(answers)); // <--- 100, 44, 0,0,0,0

      }
    }
    System.out.println(Arrays.toString(answers)); // <--- 100, 44, 0,0,0,0

    System.out.println("------------- For loop  +  find charater  -------------");
    String s3 = "abcdxyzijk";
    // print the index of j. If j is not found, print -1

    boolean found = false; // <-------
    int position = -1; // <----------
    for (int i = 0; i < s3.length(); i++) { // loop 1 次
      if (s3.charAt(i) == 'j') { // 用.charAt (i) 即 月charAt(s3 嘅資料) == 'j' <---- 搵有無J
        found = true; // 將true 定義為 found
        position = i; // 將 i 定義為 position
      }
    }
    int idx2 = -1;// inx 定義 -1 值
    if (found) {
      idx2 = position;
    }
    System.out.println("position of J =" + idx2);

    System.out.println("---------------nested loop----------------");
    // Nested Loop
    for (int i = 0; i < 3; i++) { // outer loop , 0,1,2 <---- outter loop i = run 3 次
      for (int j = 0; j < 5; j++) { // inner loop <--- inner loop j = run 5 次
        System.out.println("i=" + i + ",j=" + j);
      }
    }

    System.out.println("---------Find .MIN_VALUE-----------");
    int max = 0;
    int[] arr2 = new int[3];
    max = Integer.MIN_VALUE; // -2.1b ==== tools
    for (int i = 0; i < arr2.length; i++) {
      if (arr2[1] > max) {
        max = arr2[i];

      }
      System.out.println(max);

    }
    System.out.println("-------------Method Arrays.sort-------------");
    // Bubble sort / Insertion Sort (Nested Loop)
    int[] beforeSort = new int[] { 30, -3, 100, -102 };
    Arrays.sort(beforeSort); // Performance: nlogn
    System.out.println(Arrays.toString(beforeSort)); // [-102, -3, 30, 100]

    System.out.println(" --------------2D Array---------------");
    // ***********2D Array**************


    int[][] arr20 = new int[2][3]; // 2 rows (index 0,1) x 3 colums (0,1,2)
    arr20[1][1] = 100;
    arr20[1][2] = -99;
    arr20[0][1] = -1;

    System.out.println(Arrays.deepToString(arr20));// [0, -1, 0], [0, 100, -99]

    System.out.println(arr20.length); // row length --> 2
    System.out.println(arr20[0].length); // column lenght ---> 3

    // for loop -> access 2D array
    for (int i = 0; i < arr20.length; i++) { // row -> 2
      for (int j = 0; j < arr20[0].length; j++) // colum ->3 -> reset
        System.out.println("[" + i + "][" + j + "] , " + arr20[i][j]);
    }
        System.out.println(Arrays.deepToString(arr20)); //<------- show the 2D array value

    int[][] house = new int[4][5];
    int idx20 = 0;
    for (int i = 0; i < house.length; i++) {
      house[i][idx20++] = 1;
      for (int j = 0; j < house[0].length; j++) {
        
      }
    }
    System.out.println("length : " + house.length);
    System.out.println("length : " + house[0].length);
    System.out.println("house : " + Arrays.deepToString(house));

    /**
     * 
     * house : [[1, 0, 0, 0, 0], [0, 1, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 1, 0]]
     * house ; [x, y,w,x]
     * x = [1, 0, 0, 0, 0]
     */


     System.out.println(" -------------find the number of the\"number of the array-------------");
     Character[] characters = new Character[] {'c','9','g','0','e','!'}; //<--- Array
     // find the number of the"number of the array
     //2
     int count = 0;
     for (int i = 0; i < characters.length ; i++){ // < -- 正常loop 一次
       if ( characters[i]. charValue() >= 48 && characters[i].charValue() <=57){ //對個表，所有keyboard 都有value, 係數子value之間 搵返數字
         count++; // run 個有限制既 loop， 搵到就 count 1 次 再加埋佢  ，所以係 count++ 計幾多 次
       }
     }
   System.out.println(count); //2 

   System.out.println(" -------------count Array------------------");

   Integer[] integers = new Integer[] {10, 8, 4 , -3, 7};
   // find the number of intergers >5
   int count1 = 0;
   for (int i = 0; i < integers.length; i++){
    if (integers[i].compareTo(Integer.valueOf(5))>0) {
       count1++;
    }
   }
     System.out.println(count1); // 3 , 3 個number 大過5

     System.out.println(" -------------count Array Character------------------");

     Character[] characters2 = new Character[] {'c','9','g','0','e','!'}; //<--- Array
     // find the number of the"number of the array
     //2
     count = 0;
     for (int i = 0; i < characters.length ; i++){ // < -- 正常loop 一次
       if ( characters2[i]. charValue() >= 48 && characters2[i].charValue() <=57){ //對個表，所有keyboard 都有value, 係數子value之間 搵返數字
         count++; // run 個有限制既 loop， 搵到就 count 1 次 再加埋佢  ，所以係 count++ 計幾多 次
       }
     }
   System.out.println(count); //2 

   
 }
 
}


