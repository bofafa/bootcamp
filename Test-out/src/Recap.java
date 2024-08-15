public class Recap {
  public static void main(String[] args){
  

//#### week 1 day 2  7 Aug 2024

//- primitive (int, double, long, float, char, byte short, boolean)
// - higher and lower lever type
//math operation
//comparsion Operations
// string - Operatior - equals(), length(), charAt()
// If-else


int tops = 10;
int skirt = 24;
int shirt = 2089;

int totalProduct = tops + skirt + shirt;
System.out.println("totalProduct: " + totalProduct);
System.out.println("------------");

double topPrice= 2567.91;
double skirtPrice = 1324.86;
double shirtPrice = 3567.11;

double totalProductPrice = (tops * topPrice) + (skirt *skirtPrice) +(shirt *shirtPrice);
System.out.println("totalProductPrice :" + totalProductPrice); 
System.out.println("------------");

//String = string lon
int qty = 50;
String message = "banch#32 enqury" + qty + "tops";
System.out.println(message);
System.out.println("------------");

// equals () ........ true of false

String s10 = "hello";
String s20 = "hello";

System.out.println(s10.equals (s20));// true
System.out.println("------------");


boolean isvalueSame = "abc".equals(s20); //false
System.out.println(isvalueSame);
System.out.println("------------");

// charAt()     find the char, put the pistion in, give you the value of the word 
char result = s10.charAt(1); //2nd char of String value
System.out.println(result); // "e"
System.out.println(s10.charAt(0)); //"h"
System.out.println("------------");

char result2 = s20.charAt(0);
System.out.println(result2); //"h"
System.out.println(s20.charAt(4));//"o"
System.out.println("------------");

// lenght  .length()
System.out.println(s10.length()); // look for the length of hello = 5
System.out.println(s10.length() > 7); // ask true or false.  the length is shorter than 7 = false



  }
}
