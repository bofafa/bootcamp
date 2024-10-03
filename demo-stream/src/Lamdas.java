public class Lamdas {
  public static void main(String[] args) {



    Printable lamdaPrintable = s -> "Meow +s";
     printThing(lamdaPrintable);
    
  
  
  }

public static void printThing (Printable thing){
  thing.print("!");

}
    
    }
  
 