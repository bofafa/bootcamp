public class DemoMathOperation {
  public static void main(String[] args) {
    int x = 10 + 3;
    System.out.println(x); //13

    x = x+3 - 9 ;
    System.out.println(x); //7 

    x= x -5 * 2; //5*2 first;
    System.out.println(x); //-3

    x= (x-1)/2; // (-3- -1) /2
    System.out.println(x);

    //Speical operator -> %
    int remainder = 5 % 2;
    System.out.println(remainder); //1

    int remainder2 = 10 % 2;
    System.out.println(remainder2); //0

    System.out.println(0/10); //0
    // System.out.println( 10/0); // as developer, you should avoid by zero

    int j = 2;
    System.out.println(10/j); //5
    // you shoule adoid j become 0, before you decided tp '10/j'

    //double
    //+,-,x,/
    // /zero

    double d = 10.0 / 5.0;
    System.out.println(d);

    double d2 = (10.4 - 5.1) * 3;
    System.out.println(d2); 

    double d4 = 10.0 % 3.5;
    System.out.println(d4);

    double d7 = 0.2 + 0.1;
    System.out.println(d7);

    // + 1 operations
    int a = 1; //1
    a = a + 1;//2
    a++; //3
    ++a;//4
    a +=1; // = a =a+1 -> 4+1 = 5 
    System.out.println(a); //5

    //+ 2 operations
    int b =1;
    b = b+2;
    b +=2;
  System.out.println(b); //5

  //- 1 operations
  a = a -1;
  a--;
  --a;
  a -= 1; //equsls to "a =a -1"
System.out.println(a); //1

    // *2 operations
     b=b*2;
     b *=2;
    System.out.println(b); //20

    // Divide 


    //Example 1
    int apples = 3;
    int oranges = 10;
    double pricePerApple = 3.3;
    double pricePerOrange = 5.5;

    //code
    double totalAmount = apples * pricePerApple + oranges * pricePerOrange;
    //int * double + int * double
    //double * double + double * double
    //3.0 * 3.3 + 10.0 * 5.5

    //Example 2
    int maths = 90;
    int english = 78;
    int history = 62;
    double averageScore = (maths + english + history ) / 3.0;
    System.out.println(averageScore);
    //int / int = int
    // int/ double = double

    // 3 is int value while 3.0 is double value

    //primitives
    // int, lnong, float, double
    // char, byte, short, boolean

    //Interger: byte< short < int< long
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

    // 3 is int value while 3.0 ism double value

    //++x, x++, --X, X--


    int k = 0;
    int o = k++ +3;
    //k++ + 3
    // 1. k + 3
    // 2. Assignment (assign to o)
    // 3. k + 1
    System.out.println(o); //3
    System.out.println(k); //1


    int u = 0;
    int e = ++u +3;
    // 1. u + 1
    // 2. u + 3
    // 3. Assigment (assign to e)
    System.out.println(e); //4
    System.out.println(u); //1

  

  }
}

