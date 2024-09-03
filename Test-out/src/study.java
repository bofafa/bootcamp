

public class study {
  public static void main(String[] args) {

    //char
    //.charAt;
    //.toCharArray; //   char[] characters = s.toCharArray();
    // char to char array 


    //study OOP
    // static final
    //static
    //final
    //intance variable
    //以上係存在型式

    //study BigDecimal 

    //study random
  //study order: remove item

    //study valueOf
    //study toString

    //study: instance Variable, Static Variable, final Variable
    //instance method, static method. final method,  static final method

    //instrance method: object instance reference, must be new object，係用object 去call method
    //static methoed: static 一定要用class 名改，calass method

   System.out.println( " ----------loop ---------");
   
    int number = 5; // You can choose any number for the multiplication table

    for (int i = 1; i <= 10; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));
    }

    int[] numbers = {10, 20, 30, 40, 50};
    int targetNumber = 30;
    boolean found = false;

    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == targetNumber) {
            found = true;
            break; // Exit the loop once the target number is found
        }
    }

    if (found) {
        System.out.println("The number " + targetNumber + " is present in the array.");
    } else {
        System.out.println("The number " + targetNumber + " is not found in the array.");
    }


    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Grapes");

    String targetFruit = "Banana";
    boolean found = false;

    for (String fruit : fruits) {
        if (fruit.equals(targetFruit)) {
            found = true;
            break; // Exit the loop once the target fruit is found
        }
    }

    if (found) {
        System.out.println("The fruit " + targetFruit + " is present in the list.");
    } else {
        System.out.println("The fruit " + targetFruit + " is not found in the list.");
    }
}
}
  



