package arrayList;
import java.util.ArrayList;
public class StudyArrayList {
  
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<String>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("banana");
    fruits.add("kiwi");  
    fruits.add("apple");

    System.out.println("--------print out all ArrayList object----------------");
    System.out.println(fruits); //[apple, orange, banana, kiwi, apple]

    System.out.println("-------- Array list Size-----------------");
    System.out.println(fruits.size()); //5 // .size = the total array object

    System.out.println("-------- ArrayList .set = replace--------------");
    fruits.set(1, "blueberry");  // .set = replce the index of object (inx, object name)
    System.out.println(fruits); //[apple, blueberry, banana, kiwi, apple]
 
    System.out.println("-------- ArrayList .contant -------------");
    if (fruits.contains("banana")){
    System.out.println("the list found banana");
    }else{
      System.out.println("the list can not find banana");
    }

    System.out.println("-------- ArrayList .remove -------------");
    fruits.remove("apple"); // .remove = remove a item in arraylist
    System.out.println(fruits); // [blueberry, banana, kiwi, apple]

    System.out.println("-------- ArrayList .get =  idex-------------");
    fruits.get(3);
    System.out.println(fruits.get(3));// .get = Array list index
  
    System.out.println("--------use for loop, searching---------");
  String targetFruit = "apple";
  boolean found = false;
 int foundFruit =  -1 ;

   for (int i = 0 ; i <fruits.size() ; i++ ){
    if (fruits.get(i) == targetFruit){
    found = true;
    }
   }

   if (found){
    System.out.println( targetFruit + " is found");
   }else{
    System.out.println(targetFruit + " is not found");
   }
  

    
}
}
  