import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoString2Method {
  public static void main(String[] args) {

    //// method///// Object reference
    /// pass by value , pass by reference
    /// method -> 3 type
    /// 1.searching (contains, indexOf, lastIndexOf )
    //// 2. presentation (length, charAt, IsEmpty, isBlank. substring)
    //////3. transform (replace, trim, toLowrCase, toUpperCase)


System.out.println("-----------一menthod ; substring -------");
    String str = "VenturenixLAB, Java";
     // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println(str.substring(5, 8)); //<----- 記得POSITION 加 1 

    System.out.println("-----------一menthod ; charAt()-------");
    // prints J <--------- find the charater and print out. 
    // code here ...
    int position = -1;//
    for (int i = 0; i < str.length() ; i++ ){
      if (str.charAt(i) == 'J'){
        position = i;
      }
    }    
      System.out.println(str.charAt(position)); //J

      // prints e (the 1st e) < <--------- find the charater and print out. 
      int position1 = -1;//
      for (int i = 0; i < str.length() ; i++) {
        if (str.charAt(i) == 'e'){
          position1 = i;
          break;
        }
      }
         System.out.println(str.charAt(position1)); //e



    System.out.println("-----------一menthod ; isEmpty() isBlank() ----------------");
    //isEmpty() vs isBlank() <------ compare 用，有 or 無
    String s1 = "hello";
    System.out.println(s1.isEmpty()); // false
    System.out.println(s1.isBlank()); // false

    String s2 = "";
    System.out.println(s2.isEmpty()); //true
    System.out.println(s2.isBlank()); //true
    
    String s3 = " ";
    System.out.println(s3.isEmpty()); // false
    System.out.println(s3.isBlank()); // true

    String s4 = "hello ";
    System.out.println(s4.isEmpty()); // false
    System.out.println(s4.isBlank()); //  false

    String s5 = "Hello";
    System.out.println(s5.toLowerCase()); // hello // but s5 never change, String value never change
    System.out.println(s5); // Hello
    System.out.println(s5.toUpperCase()); // HELLO

    System.out.println("-----------一menthod ; indexOf ----------------");
    //indexOf() <----- 搵資料
    s5.indexOf('e'); //搵有幾多個e ----> 1 
    System.out.println(s5.indexOf('E')); // -1 (case sensitive) <------ 搵唔到出 -1
    System.out.println(s5.indexOf("ll")); // 2
    System.out.println(s5.indexOf('e',2)); // -1
    System.out.println(s5.indexOf("ll", 3)); //-1
    System.out.println(s5.indexOf("ll", 2)); //2

    // lastIndexOf() <---- 搵最後個資料
    System.out.println(s5.lastIndexOf('l')); //3

 System.out.println("-----------menthod ; concat----------------");
    // +, +=
    // concat  /<----- concat 等如 黐埋一齊
    String s6 = "hello";
    s6 = s6 + "!!!";

    String s7 = "hello";
    s7 += "!!!";

    String s8 = "hello";
    s8 = s8.concat("!!!"); //<----- concat 等如 黐埋一齊

    System.out.println(s6); //"hello!!!"
    System.out.println(s7); // "hello!!!"
    System.out.println(s8); // "hello!!!"



    System.out.println("-----------menthod ; startWith() endsWith()-------------");
    //  starsWith() <------- compare , 入資料，佢答你有or無 資料第一粒有無
    //  endsWith() <--------- compare, 入資料，佢答你有or無 資料最尾有無
    // new String ("bootcamp") 直接落print // bootcamp 無定義，即用即棄 

    System.out.println(new String("bootcamp").startsWith("boot"));// true 
    System.out.println(new String ("bootcamp").indexOf("boot")==0); //true <---- 指令： "boot" 係咪喺第一個位呀？ == 0
    System.out.println(new String ("bootcamp").endsWith("boot")); // false
    System.out.println("bootcamp".endsWith("boot") );// false


    System.out.println("-----------menthod ; replace()-------------");
    // replace() 
    String s9 = "hello!!!";
    s9 = s9.replace('!', '?');
    System.out.println(s9); // hello ???

    s9 = "abcdef";
    s9 = s9.replace("bcd", "ijk");
    System.out.println(s9); //sijkef

    System.out.println(s9.contains("ijk"));// true
    System.out.println(s9.contains ("IJK")); // false

    System.out.println("-----------menthod ; trim()-------------");
    //trim() <---- remove 頭尾 space
    String s10 = "  Vincent Lau  ";
    System.out.println(s10.trim()); //"Vicent Lau"

    System.out.println("-----------menthod ; compareTo()-------------");
    // String 用 Ascii 比較 (Ascii 即係個keyboard value 表)
    //compareTo () -> 8 Wrapper Class + String Class // string 通常用Equal to, 較少用 compareto
    // a.compareTo(b) > 0 --------> a > b
    // a.compareTo(b) == 0 -------> a ==b
    // a.compareTo(b) < 0 --------> a < b 

    //String -> >,< 
    //Ascii
    System.out.println("abc".compareTo("bbc")); // -1
    System.out.println("bbc".compareTo("abc")); //1 ?????????/
    System.out.println("abc".compareTo("acc")); // -1
    System.out.println("abc".compareTo("abc")); //0

    //錯誤示範
    String s11 = "abc";
    String s12 = "abc";
    System.out.println(s11==s12); // true
    String s13 = "abx";

    System.out.println("-----abc -> cde----------------");
    //"abc" -> "cde"
    char[] characters = "abc".toCharArray();
    System.out.println(Arrays.toString(characters)); //[a, b, c]

    char c = ' ';
    String result ="";
    for (int i =0 ; i < characters.length; i++){
      c = (char) (characters[i]+2); // Char +2 -> int
      result += c; //String + char
      }
      System.out.println(result); //cde


    System.out.println("----VINCENT change to lower cap vincent-----------------");
    // VINCET change to lower cap vincent
    String name = "VINCENT"; 
    c = ' ';
    result = "";
    char[] names = name.toCharArray(); 
    for (int i = 0 ; i < names.length; i++){
      c =names[i];
      result += c;
      c= (char) (names[i] +32); //char +2 ->int
    }
      System.out.println(result);

    System.out.println("----------jenny to Jenny----------------");
      String jenny = "Jenny"; // the first one change to cap letter
      // 2, not found ---> -1
      char target = 'n';
      int idx = -1;
      for (int i = 0 ; i < jenny.length(); i++ ){
      if (jenny.charAt(i) == target){
        idx =i;
        break;
      }
      }

      System.out.println(idx); //2

      // lastIndexOf()
      for (int i= jenny.length() -1; i >= 0; i--){
        if (jenny.charAt(i)==target);
        idx = i;
        break;


      }
      System.out.println(idx); //3
  
  System.out.println( "--------copy of Array----------");
  int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, };
  int[] newArr =  Arrays.copyOf(my_array, my_array.length);
    }


  

}
