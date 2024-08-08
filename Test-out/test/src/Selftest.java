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

