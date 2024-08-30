public class DemoForEach {
  public static void main(String[] args) {

    // main differene between for loop and for each loop
    // for loop -> able to access all elements during each interation
    // for-each -> easy to read/use, because no index
    
    System.out.println( "----------- for loop ----------------------");
    // i is array idex
    int [] arr = new int[]{ 2 ,9,10,-3 };
     for (int i = 0; i <arr.length; i++){
      System.out.println(arr[i]); // print out elements
     }

      System.out.println( "----------- for each loop ----------------------");
       int sum = 0;
      for (int i :arr) {    
        sum += i; //System.out.println(i); // print out elements
        System.out.println(i);
      
     }

     Integer a = null;
     a =3;
     a = new Integer(10);
     //String; 

     System.out.println( "----------- defult vallue Wrapper class /String-----------------");

     Integer x = null;
     System.out.println( x); //null
     //x,inValue(); //error

     String s = null;
     System.out.println(s);
     // s.charAt(0); // error, Null Pointer Exception

     s="";

    }
}
