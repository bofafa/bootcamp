public class DemoIf {
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
    int number = -3;
    if (number > 0) {
      System.out.println("The number is positive.");
    } else if (number < 0) {
      System.out.println("The number is negative.");
    } else {
      System.out.println("The number is zero.");
    }
    // "The number is positive."
    // "The number is negative."

    // Example 2 (Avoid overlap)
    int score = 85;
    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80 && score < 90) {
      System.out.println("B");
    } else {
      System.out.println("F");
    }

    // Example 3
    int a = 20;
    int b = 10;
    int max; // declaration
    int min;
    if (a > b) {
      max = a; // assignment
      min = b;
    } else {
      max = b;
      min = a;
    }
    System.out.println(max + " is larger than " + min + ".");
    // "20 is larger than 10."

    // Example 4
    String day = "sunday";
    // "Wednesday is weekday."
    // "Sunday is weekend."
    // "Saturday is weekend."
    
    // Approach 2
    if ("Wednesday".equals(day) || "Monday".equals(day) || "Tuesday".equals(day)
        || "Thursday".equals(day) || "Friday".equals(day)) {
      System.out.println(day + " is weekday.");
    } else {
      System.out.println(day + " is weekend.");
   
    }


    // Example 5
    int num = 8;
   if (num % 2 ==1){
    System.out.println(num +  "is an odd number.");
   } else{
    System.out.println(num + "is an even number.");
   }
     //(num % 2 > 0 ) = odd number

    // 7 is an odd number.
    // 8 is an even number.

    // Example 6
    String str = "hello";

    // The last character of str is o
    // This is an empty String
     if (str.length() == 0) {
      System.out.println("Empty String");
     } else{
      System.out.println(str.charAt(str.length()-1));
     }



    // Example 7
    // Reversed String
     //String s = "abc"; 
     String s = "abc";
     s = "" + s.charAt(2)+ s.charAt(1)+ s.charAt(0); // char + char + char
     System.out.println(s); //cba
     // The reversed string is cba

    // Example 8
    // Leap Year
    //1. Divided by 4
    //2. Not Divided by 100
    //3. or divided by 400

    int year = 2000;
    // Sample output:
    //1900 is not a leap year.
    //2000 is a leap year
    //2004 is a leap year

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
      System.out.println(year + "is a leap year" );
      }else{
        System.out.println(year + "is not a leap year");
      }

      int year2 = 2003
      boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
      boolean isLeap = false;
      if (year % 4 == 0){ // 2004
        if (year % 100 ==0 ){
          if( year % 400 == 0) {
            //i
          }
        }
        }

    
    // Example 9
    int age = 20;
    boolean isCitizen = false;

    //Eligible to vote.
    // not eligible. age < 18.
    // not elighible. not a citizen
    // not elighible. Age < 18 and not a citizen.

    if (age > 18 && isCitizen == true){
      System.out.println("Eligible to vote.");
    }else if (age < 18 && isCitizen == true){
      System.out.println("Not Eigible. Age < 18.");
    } else if (age > 18 && isCitizen == false){
      System.out.println("not elighible. not a citizen");
    }else{
      System.out.println("not elighible. Age < 18 and not a citizen.");
    }
      
    



    // Example 10
    double totalPurchase=250.0;
    // >= 500.0 -> 20% off
    // >= 200.0 - > 10% off
    // <200 -> no discount
    // amountToPay
    //Discount

    double discount =0.0d;
    if (totalPurchase >= 500.0d) {
      discount = totalPurchase * 0.8;
   }else if (totalPurchase >= 200.0d && totalPurchase <=500.0d){
    discount = totalPurchase * 0.9;
   }
   double amountToPay = totalPurchase - discount;

    //if (totalPurchase >= 500.0 
    //System.out.println("Discount amount =" discount);
    //System.out.println("Amout to pay=" + amountToPay);


    //Example 11
    //char c = 'a';
    // a e i ou -> vowel
    // a is vowel
    // c is consonant.
    char c = 'a';
    if ( c== a || c == e || c == i || c== ou);{
      System.out.println("a is vowel");
    }else{
      System.out.println(" c is consonant");
    }
  
    // Teaching
    //
    String s1 = "hello";
    System.out.println(s1.contains("ll")); //true
    System.out.println(s1.contains("llll")); // false
    s1 = "helloll";
    System.out.println(s1.contains("ll")); //true
    

    //Example 12
    String password = "Admin1234567#";

    //strong password defintion:
    // # ! @ $ -> special character
    // password length >= 12

      boolean withOutSpecialCharacter = false;
      if (password.length()>=12){
        withOutSpecialCharacter = !password.contains("#")
        && !password.contains("!")
        && !password.contains("@")
        && !password.contains("$");
      if (!withOutSpecialCharacter) {
        System.out.println(" its a strong pw");
    }else{
     System.out.println("weak PW, Length < 12");{
    }else{
      System.out.println("weak PW, no special character.");
    }
  }


