
public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    System.out.println(str.contains("c"));
    System.out.println(str.indexOf("c"));
    System.out.println("the last character of c is" + str.lastIndexOf ("c"));
 

    // if not found, print "Not Found."
    // code here ...

  }
}