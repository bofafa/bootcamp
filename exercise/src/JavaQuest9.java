
/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // code here ...
    int position = -1;//
    for (int i = 0; i < str.length() ; i++ ){
      if (str.charAt(i) == 'J'){
        position = i;
      }
    }    
      System.out.println(str.charAt(position)); //J

      // prints e (the 1st e)
      int position1 = -1;//
      for (int i = 0; i < str.length() ; i++) {
        if (str.charAt(i) == 'e'){
          position1 = i;
          break;
        }
      }
         System.out.println(str.charAt(position1)); //e

    // Use indexOf()
    // prints 3
   
    System.out.println(str.indexOf('t')); //3
    // prints 9
    System.out.println(str.indexOf('x')); //9
    // prints 10

     System.out.println(str.indexOf('L')); //10

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    System.out.println(str.replace("Java", "Coding")); //VenturenixLAB, Coding

    // int length()
    // prints 19
    // code here ...
    System.out.println(str.length()); //19

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println(str.substring(5, 8)); //


    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    String name = "venturenixlab, java";
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    
    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
      System.out.println(str.replace('e','*' ) .concat("!!!").toUpperCase());
  }
}