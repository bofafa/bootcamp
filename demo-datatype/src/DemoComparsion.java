public class DemoComparsion {
  public static void main(String[] args) {
    //>,<,>=,<=
    System.out.println( 3 >= 2); //ture
    int x =10;
    int y = 11;
    boolean isYLargerThanX = y > x ;
    System.out.println(isYLargerThanX); // true

    System.out.println(x+3 < y+2); // False
boolean result = x + 3 < y +2; // false 
    //== , !=
    //single = -----> assignment
    int x2 = 3;
    //double "==" -----> compare if theyn are equal
    System.out.println(x2==4);// false
    System.out.println(x2 !=3);//false

    double d1 = 10.4;
    System.out.println( d1 <= 10.4); //true
    //same as int, support all basic operators

    //More than one event
    int j1 =10;
    int j2 = 12;
    System.out.println(j1 > j2);//false
    // AND &&
    // OR ||
    System.out.println(ji>j2 || j1 < 11);// false || true -> true
    System.out.println(j1 >j2 && j1 < 11); // false && true --> false

    System.out.println(true && true); // true
    System.out.println(true && false); // false
    System.out.println(true || false); // true
    System.out.println(false || false); //false


    
  }
  
}
