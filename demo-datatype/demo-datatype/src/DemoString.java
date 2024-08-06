public class DemoString {
  public static void main(String [] args){
    System.out.println("hello world!!!!");
    //"hello world" -->string value

    //string is not a primitive!!!
  

    String s2 = "def"; // "def" is a String value, and then assign to string variable
    //string s3 =3
    // string s4 = true;

    String s3 = "3"; //Its ok, but you cannot perform math operation
    s3 = s3 + 1; // append meaning,but not +1
    // string value + int value
    // string value + string value
    System.out.println(s3); //"31"

    s3 = s3 + true;
    System.out.println(s3); // "31true"

    //in string, there are no +, *, -, /


    //Example 1
    int age = 40;
    String message = "i'm" + age + "years old.";
    System.out.println(message);

    //Example 2
    char grade = 'A'; 
    System.out.println("My grade of Histiory is " + grade);
    // String +char = Strin
    
    //+=
    String firstName = "Vincent";
    String lastName = "Lau";
    String fullName = ""; //empty String valuen 

    fullName += firstName + " " + lastName;
    //fullName = fullName + firstName + " " + lastName;
    System.out.println(fullName);

    // Primitive -> Math Operation, Comparsion (>,<,>=,<=,==,!=)
    //String -> not Primitiv, we use method (tool) to compare their values
    String s10 = "hello";
    String s20 = "hello";

    // equals ()
    System.out.println(s10.equals (s20));// true

    boolean isvalueSame = "abc".equals(s20); //false

    // charAt()
    char result = s10.charAt(1); //2nd char of String value
    System.out.println(result); // "e"
    System.out.println(s10.charAt(0)); //"h"
    //System.out.println(5); // out or range 5 - > runtime error
     //System.out.println(-1); // index negative- > runtime error
     //s10.charAt(1L) // error
     //s10.charAt(1.0) // error
     System.out.println(s10.charAt(2)=='l');//true
     System.out.println(s10.charAt(2)!='l');//false

     // length()
     System.out.println(s10.length());//5
     System.out.println(s10.length () >= 5);// int 5 >= 5 ? - > true

      }
}
