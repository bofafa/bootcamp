public class DemoForLoop {
  public static void main(String[] args) {
    int x = 3;
    x *= 3;
    x *= 3;
    x *= 3;
    System.out.println(x);

    int y = 3;
    for (int i = 0; i < 3; i++) 
    y = y * 3;
    System.out.println(y); // 81
    // step1 int 1 = 0
    // s2 i < 3 ----3個QOUTA RUN , RUN 第一次
    // s3 y = y* 3 ---- 9
    // s4 i++ =1
    // s5 i < 3 = true ----- 2 qouta, run again
    // s6 y= y * 3 ----- 9 * 3 =27
    // s7 i++ = 2
    // s8 i < 3 = true ------- 1 qouta, run agaun
    // s9 y =y * 3 ------- 27 * 3 = 81
    // s10 1++ = 3
    // s11 1 < 3 = false no qouta, stop runing
    // s12 exit // result step 9 = 81

    // Example 1
    // print out 5 time hello world
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello world");
    }

    System.out.println("2---------------");

    // Example 2
    // we can use for other purpose.
    for (int i = 0; i < 6; i++) {
      System.out.println(i);
        }// 0 1 2 3 4 5
    
        System.out.println("3---------------");

    // Example 3
    // print all odd number between 0 -10
    // loop an if
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        System.out.println("odd number  : " + i);
      }
    }
    System.out.println("4---------------");

    // Example 4
    // 10//8//6//4//2/
    // apprioach 1
    for (int i = 10; i > 0; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    // apprioch 2

    for (int i = 0; i < 10; i++) {
      if (1 % 2 == 0) {
        System.out.println(10 - i);
      }
    }

    System.out.println("5---------------");
    // Example 5
    String str = "abcdefghk";
    // "acegik"
    // loop, if, charAt, lenght
    String str2 = " ";
    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) {
        System.out.println("Round : " + i + " , " + "Before : " + str2);
        str2 = str2 + str.charAt(i);
        System.out.println("Round : " + i + " , " + "After : " + str2);
      }
    }

    //// *****
    String str1 = "";

    System.out.println("6---------------");
    // Example 6
    String s2 = "bbahkjhkjhj";
    char target = 'e';
    int count = 0;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == target) {
        count++;
      }
    }
    System.out.println("the number of character" + target + "is" + count);
    // the number of character e is 3

    System.out.println("7---------------");
    // Example 7 -counting
    // 1-100
    // how many numbers can be divided by 3 or dvided by 4?
    int total0 = 0;
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 4 == 0) {
       // total0 = total0 + i;
       total0 = total0 + 1;
      }
    }    

        System.out.println("count =" + total0);

    System.out.println("7.1---------------");
    //1+100 
    // total of 1 + 100
    int total100 =0;
     for ( int i = 1; i < 100; i++){
      total100 = total100 + i;
     }
     System.out.println(total100);
    

    System.out.println("8---------------");

    // Example 8
    // 1-50
    // find the total number, which sum up all odd number and subtract all even
    // number 1-50
    int total = 0;
    for (int i = 1; i < 51; i++)
      if (i % 2 == 1) {
        total += i;
      } else {
        total -= i;

      }
    System.out.println(total); // -25
     System.out.println( "9-------------");


    // Example 9
    String s3 = "abcdxyzijk";
    // print the index of j. If j is not found, print -1
    boolean found = false;
    int position = -1;
    for (int i = 0; i < s3.length(); i++) {
      if (s3.charAt(i) == 'j') {
        found = true;
        position = i;
      }
    }
    int idx = -1;
    if (found) {
      idx = position;

    }
    System.out.println("position of J =" + idx);
  /////
  ////i=0,j=0
  ////i=0,j=1
  ////i=0,j=2
  ////i=1,j=0
  ////i=1,j=1
  ////i=1,j=2
  ////i=2,j=0
  ////i=2,j=1
  ////i=2,j=2

    // Alternative
    System.out.println(s3.indexOf('j')); // 8
    s3 = "abc";
    System.out.println(s3.indexOf('j')); // -1

      


    System.out.println("10------------");

    // Example 10
    // find last charater
    String s4 = "hello";
    // check the last mcharacter is o -- > true
    char targetEndwith = 'o';
    System.out.println(s4.charAt(s4.length() - 1) == targetEndwith);// true

    // endWith(), starWith ()
    System.out.println(s4.endsWith("o"));
    System.out.println(s4.startsWith("he"));

    // substring (find the positon)
    // contains -> true or false , indexOf -> 入內容搵位置, substring-> 入位置搵內容
    String s5 = "abcdefghijk";
    // find "def"
    System.out.println(s5.contains("def"));// True
    // Find the index between 2 and 4
    System.out.println(s5.substring(2, 2 + 3));// cde
    System.out.println(s5.substring(0, 3)); // abc (content)
    System.out.println(s5.indexOf("abc")); // 0 (position)
    System.out.println(s5.substring(0,1)); // a frist charater

    // Example 11
    String s6 = "abcdefghijk";
    String subString = "def";
    // dont use indexOf() or cointains()
    // for loop
    // found of not found

    System.out.println( "---------------nested loop----------------" );
    // Nested Loop
    for (int i = 0; i < 3; i++) { // outer loop , 0,1,2
      for (int j = 0; j < 3; j++) { // inner loop
        System.out.println("i=" + i + ",j=" + j);
      }
    }

    // Example 12
    // break -> exit the loop
    for (int i = 0; i < 5; i++) {
      System.out.println("hello");
      if (i >= 3) { //<---- what make it break
        break; // <--- break always put in the end 
        // hello * 4
      }
    }
    

    // Example 13
    // break <- searching
    String s7 = "ijkdef";
    for (int i = 0; i < s7.length(); i++) {
      if (s7.charAt(i) == 'k') {
        found = true;
        break; // break the loop
        
      }
    }

    // Example 14
    // countinue - skip some patterns
    for (int i = 0; i < 50; i++) { // 0-49
      // if (i%2 ==1) {}
      if (i % 2 == 0) {
        continue; // skip the rest of code for current iteration
      }
      System.out.println(i); // odd number
    }

    // Example 15
    // ****
    for (int i = 0; i < 5; i++) {
      System.out.println("*");
    }
    System.out.println("");

    // Example 16
    // ***** i=0 , print * 5 times
    // **** i=1 , print * 4 times
    // *** i=2 , print * 3 times
    // ** i=3 , print * 2 times
    // * i=4 , print * 1 times

    // Nested loop (i and j)
    String star = "*";
    for (int i = 0; i < 5; i++) { // control the number of row
      for (int j = 0; j < 5 - i ; j++) { // action for the folloing row
        //star += star;
        System.out.print(star);
      }
      System.out.println();
    }
   

    // take out 2 stars
    String star2 = "*";
    for (int i = 0; i < 5; i=i+2) { //i is the action for next loop, i+2 = 2 stars
      for (int j = 0; j < 6 - i ; j++) {  // j = number of stars 
        System.out.print(star2);
      }
      System.out.println();
    }

// example 17

//notes Challange
String searchMe = "peter piper pickde a peck of pickled peppers";
int num = 0;

for (int i = 0; i < searchMe.length(); i++){
  if (searchMe.charAt(i) == 'p'){
    //continue;
  }

num++;

}
System.out.println("found "  + num + "P's is the string.");

  }
}
