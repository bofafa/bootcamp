

public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    
    int first = 0, second = 1;

      int count =0;
    for( int i= 0 ; i < 15 ; i++) {
    
      int FibonacciSequence = first + second;
      System.out.println(first + second);
      first=second;
      second=FibonacciSequence;
      count++;
      if (count == 15)
      break;
    }
    }

  }
