public class SelfQuestWeek1 {

  public static void main(String[] args) {

        int x = 30;
    
        if (x >= 30) {
          System.out.println("x >= 30"); // print
        } else {
          System.out.println("x < 30");
        }
    
        boolean isXLargerThan30 = x >= 30; // true
    
        if (isXLargerThan30) {
          System.out.println("x >= 30"); // print
        } else {
          System.out.println("x < 30");
        }
    
        // 8 primitives, String (equals(), charAt(), length())
    
        // Example 1
        // 1. Else-if (Avoid event overlap)
        // "The number is positive."
        // "The number is negative."
    
        // Example 2 (Avoid overlap)
        int score = 85;
        if (score >= 90) 
    
        // Example 3
        int a = 20;
        int b = 10;
        int max; // declaration
        int min;
        // "20 is larger than 10."
    
        // Example 4
        String day = "Wednesday";
        // Sample Output:
        // "Wednesday is weekday."
        // "Sunday is weekend."
        // "Saturday is weekend."
    
      
        // Example 5
        int num = 8;
        // Sample ouput:
        // 7 is an odd number.
        // 8 is an even number.
        if (num % 2 == 0) { 
          System.out.println(num + "is an even number);
          }else{ 
          System.out.println(num + "is an out number); }
      
       
        
        // Example 6
        String str = "hello";
        // "" -> empty string
    
        // Sample ouput:
        // The last character of str is o
        // This is an empty String
       
    
        // Example 7
        // Reversed String
        String s = "abc";
    
        // The reversed string is cba
    
        // Example 8
        // Leap Year
        // 1. Divided by 4
        // 2. Not Divided by 100
        // 3. Or divided by 400
    
        int year = 1900;
        // Sample output:
        // 1900 is not a leap year.
        // 2000 is a leap year.
        // 2004 is a leap year.
        // 2003 is not a leap year.
    
        // Example 9
        int age = 20;
        boolean isCitizen = false;
        // age 18 or above and he is a citizen -> eligible to vote.
    
        // Eligible to vote.
        // Not eligible. Age < 18.
        // Not eligible. Not a citizen.
        // Not eligible. Age < 18 and not a citizen.
    
        // Example 10
        double totalPurchase = 250.0;
        // >= 500.0 -> 20% off
        // >= 200.0 -> 10% off
        // < 200.0 -> no discount
    
        // System.out.println("Discount amount=" + discount);
        // System.out.println("Amount to Pay=" + amountToPay);
    
        // Example 11
        char c = 'a';
        // a e i o u -> vowel
    
        // a is vowel.
        // c is consonant.
    
        // Teaching
        // contains()
        String s1 = "hello";
        System.out.println(s1.contains("ll")); // true
        System.out.println(s1.contains("lll")); // false
        s1 = "helloll";
        System.out.println(s1.contains("ll")); // true
    
        // Example 12
        String password = "Admin1234567#";
        
        // Strong password definition:
        // # ! @ $ -> special character
        // password length >= 12
    
        // It is a strong password.
        // It is a weak password. No speical character.
        // It is a weak password. Length < 12.
    
      }
}

  