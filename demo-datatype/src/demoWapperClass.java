import java.lang.reflect.Array;

public class demoWapperClass {
  public static void main(String[] args) {

    //Java Class   
    // 用object 形容呢個世界
    //Cap letter is a class ---> a program //object 用cap letter
    // cap letter 先出 Method
    // 所有 object 要 new 咗----> 先可以可以拎個 內容Value


    int x = 10; // 10 is an int value, x is variable <---- 只可計數
    
    // int -> integer 整數 <-----object 可用工具
    Integer i1 = 10;//i1 is an object reference (like a address) // object 用cap letter String/ Inteager
    //JAVA -> create Integer object


    Integer i2 = new Integer(10);//i2  - > object reference, 10 is an object
    //object reference stores object address

    double d1 = i2.doubleValue(); // i2 is an obj, doubleValue，拎i2 個數值內容，i2 依然係 object

    System.out.println(i2.compareTo(new Integer(11))); //-1

    //if you are going to compare objects (Integer, Long, Short, Byte) 
    double d2 = new Integer(3); 
    System.out.println(d2); // 3.0
    //String str = d2.toString(); //3.0
    

 System.out.println("--------------有new = charater------------");

    String s = "hello"; //JAva  -> create String object 

    //Short, Long, Byte
    Long l1 = new Long(10);// 10 -> int
    Long l2 = new Long(10L); //10 -> long
    Long l3 = new Long ("10"); // 10 -> string


    Long l4 = new Long(4000);
    short sl = l4.shortValue(); // (short) 14
    System.out.println(sl); // -25536 -> overflow


    int x6 = new Double(10.5).intValue();
    System.out.println(x6); // 10 -> precision loss

    short s3 = new Double (40000.55).shortValue();
    System.out.println(s3);// -25536

  //char -> Charater
  Character c ='a';// auto - box ..... 'a' is an object // but actually it is calling "new"
  //int -> integer
  Integer i5 =10; // auto - box...... '10' is an object // but actually is calling "new"
  Boolean b1 = true; //auto - box, new boolean (true)
  b1 = new Boolean("true");
  b1 = new Boolean(false);

  
      //8 primitives + 8 wrapper classes + String 
      int[] arr = new int[] {2, 6, 10}; 
      Integer[] arr2=  new Integer[] {new Integer(2), new Integer (6), new Integer(10)};
      Integer[] arr3 = new Integer[] {2, 6, 10};


    Integer g = 10;
    if (g.equals(new Integer(10)));{

    }
    Integer[] integers = new Integer[] {10, 8, 4 , -3, 7};
    // find the number of intergers >5
    int count = 0;
    for (int i = 0; i < integers.length; i++){
     if (integers[i].compareTo(new Integer(5))>0) {
        count++;
     }
    }
      System.out.println(count); // 3 , 3 個number 大過5

      Character[] characters = new Character[] {'c','9','g','0','e','!'}; //<--- Array
      // find the number of the"number of the array
      //2
      count = 0;
      for (int i = 0; i < characters.length ; i++){ // < -- 正常loop 一次
        if ( characters[i]. charValue() >= 48 && characters[i].charValue() <=57){ //對個表，所有keyboard 都有value, 係數子value之間 搵返數字
          count++; // run 個有限制既 loop， 搵到就 count 1 次 再加埋佢  ，所以係 count++ 計幾多 次
        }
      }
    System.out.println(count); //2 
  }
  
}
