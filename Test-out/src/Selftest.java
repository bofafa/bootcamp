import java.util.Scanner;

public class Selftest {
  
  public static void main(String[] args) {
    

    int k = 0;
    int o = k++ +3;
    //k++ + 3
    // 1. k + 3
    // 2. Assignment (assign to o)
    // 3. k + 1
    System.out.println(o); //3
    System.out.println(k); //1

  int x = 3;
  int y = (x++ + 3) * x++;
  // what is y?



        // Example 5
        int num = 7;
        // Sample ouput:
        // 7 is an odd number.
        // 8 is an even number.
        if (num % 2 == 0) {
          System.out.println(num + "is an even number");
          }else{ 
          System.out.println(num + "is an odd number"); }
      


 System.out.println("--------------for loop ; ok understand ---------------");
 /// about loop////
//迴圈 loop 點用？？？？？？
/// 需重復輸出或輸入指令：
              //int i= 0 <-----由邊度開始？
              // i < 8 <------- 要LOOP 幾多次？？ 
              // i++ <------- 將第一次LOOP 到嘅 VALUE 再 ＋ 1 
              
            for (int i = 0 ; i < 5 ; i++){  
              System.out.println(i);
              }
              //print out: 
              //0  <------ 0 開始係因為 i = 0 
              //1  <------- Print 到1 出嚟， 因為  i++ ， 0+ 1 = 1
              //2  <--------Print 到2 出嚟， 因為 1 + 1 = 2
              //3 <--------again
              //4  <----------- print 到4， 因為 i< 5 , 只LOOP 5 次 

              System.out.println("------------- For loop 總和-------------");
              // 1＋2＋3＋4＋5
               int total = 0;
              for (int i = 1 ; i <= 5 ; i++){
              total = total + i;
              }
            System.out.println(total);
       
            
            int maxNum2 =5;
            for (int i = 1 ; i <maxNum2; i++ ){
              System.out.println(i);
              
             
              
            }


  }
}