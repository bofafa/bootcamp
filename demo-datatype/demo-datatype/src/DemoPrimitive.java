public class DemoPrimitive {
  public static void main(String[]args){
   // every line of java code must end with ;
   // Declaration & Assigment
   int x = 100;
   // "int" is a type that can store an intger
   int y;
   // Assigment
   y= -13;
   System.out.println(y); //-13
   // Re-assigment
   y = 9;
   System.out.println(y); // 9
   System.out.println(x);
   System.out.println(20);
   System.out.println(x); 

   int age = 30;
   //int q = 30.5 //30.5 is number with decimal, q is declared by int, do cannot store decumal place
   double q = 30.5;
   System.out.println(q); // 30.5
   double u = 10; // 10 is a int value
   //when int value assigned to double type variable (變量)
   //java will help auto-convert nt value to duble value 10->10.0)
   //finally, assugnment -> 10.0 -> u

   double i = 10.0;
   //10.0 i a double value, assign to bariable i

   char c = 'i';
   char c2 = '9';
   char c3 = ' ';

   double d1 = 3.3; // by defeult 3.3 is double value
   double d2 = 3.3d; // 'd' is to describe 3.3 is a double value
   //float f1 = 3.3f; 3.3 is double, which is higher than float
   // float is lower level type comparing with double
   float f2 = 3.3f; // assign float value to flat variable
   double d3 = 3.3f; // assign float value to float varible

   int h = 4; // 4 int value
   long l1 = 4; // long is higher level than int: int value -> 4 long value
   long l2 = 4L; // 4L is long value

   //primitives
    // int, lnong, float, double
    // char, byte, short, boolean

    //Interger: byte< short < int< long


    // byte, short, int, long
    // float, double
    // char
    // boolean

    byte b1 = 3; //from -128 to 127
    // assign int value tom byte variable
    // int value -> byte value (implicitly)

    int i2 = 3;
    byte b2 = i2; // java doesnt not akkw higher level type to lower level type

    //assign byte varuable to int variable
int i3 = b1; //ok
b1 = -128;
b1 = 129; // out of range
b1 = 127;
b1 = 128; // out of range

    short s1 = 3; //-32768 to 32767
    //short vs int
    int i4 = s1;
    s1 = -32768;
    s1 = 32769;
    s1= 32767;
    s1= 32768;
    // s1 = i3;// i3 ism higher level type




    int i1 =3; // from -2.1b to 2.1b
    long l3 = 3;// from -2^63 to 2^63

    // 3 is int value

    boolean bl = false;
    bl = true;

    boolean result = 3 > 2;
    System.out.println(result); // true
    System.out.println( 3 > 2); // true
    System.out.println( 2 > 3); // false

    int i9 = 200;
    System.out.println(i9 > 199);// ture

    int age2 =66;
    boolean isElderly = age2 > 65; // event definition
    System.out.println(isElderly); // true

    int k = 0;
    int o = k++ +3;

    
  }
}
