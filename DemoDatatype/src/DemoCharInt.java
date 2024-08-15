public class DemoCharInt {
  public static void main(String[] args) {
    char c = 'A';
    int x = c; // upcasting/ promotion
    System.out.println(x); // 65 (ASCII)

    // char c2= x // not ok, downcasing

    char c3 = '0'; // 48
    int x2 = c3;
    System.out.println(x2); // 48

    // char[] -> String.class
    System.out.println("hello".substring(0, 2)); // he

    // long -> float
    float f1 = 10L;
    System.out.println(f1); // 10.0
    // long -> double
    double d1 = 100L;
    System.out.println(d1); // 100.0
    // int - > float
    float f2 = 10;
    System.out.println(f2); // 10.0
    // char -> float
    float f3 = 'c';
    System.out.println(f3); // 99.0
    // char -> double
    double d2 = 'B';
    System.out.println(d2); // 66.0 = B = ASCll value = 66

    // char math operation -> + , -, X, %
    int sum = 'a' + 'a';
    System.out.println(sum); // 194 == ASCll value 'a' + 'a' = 97 + 97

    // counting example
    char[] arr = new char[] { 'a', 'y', 'z', 'b', 'a' };
    int[] counts = new int[26]; // <------統計用
    // max count value = a
    int target = ' ';
    for (int i = 0; i < arr.length; i++) {
      counts[arr[i] - 97]++;

    }
    char printTarget = ' ';
    int max = -1;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > max) {
        max = counts[i];

        // int -> char
        // in Java, you can still downcast the value to lower label type by
        // explivitly conversion
        target = (char) (i + 97);
        printTarget = (char) target;
      }
    }
    System.out.println("printTarget : " + printTarget); // a // 97 ???????why????????
    System.out.println(target); // a // 97 ???????why????????

    int s = 4900;
    char c4 = (char) s;
    System.out.println(c4);

    // Overflow
    // int --> byte
    byte b1 = (byte) 128; // 127+1
    System.out.println(b1); // -128
    b1 = (byte) 129;
    System.out.println(b1); // -127
    b1 = (byte) 384;
    System.out.println(b1); // -384??

    int asset = (int) 2_000_000_000;
    // overflow
    System.out.println(asset); // -2094967296

    // double -> int (precision loss)
    double d10 = 10.25;

    int x5 = (int) d10;
    System.out.println(x5); // 10.25 -> 10
    d10 = 10.99;
    x5 = (int) d10;
    System.out.println(x5); // 10.99 -> 10

    // overflow + for loop (careless mistake)
    // for (int i = 0; i < 2_200_000_000L; i++) {
    //   // system.out.println("hello");

    // }

    byte b20 = 7;
    int i20 = 8;
    boolean result = (b20 < i20); // true
    System.out.println("result : " + result);

    // byte b21 =128; // compile error, Not overflow;
    int i21 = 128;
    byte b22 = (byte) i21; // overflow

    System.out.println("----------.MIN_VALUE-----------");
    int[] arr2 = new int [3];
    max = Integer.MIN_VALUE; // -2.1b ==== tools
    for (int i=0; i< arr2.length; i++){
      if (arr2[1] > max) {
        max = arr2 [i];

      }
      System.out.println(max);
    }

  }
}
