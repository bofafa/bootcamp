package sorting;
//!!! Complile TIme
//1. "implements Interface" implies the object of this class must contain
//compareto() , method at compile time
//2. The method/object has to ensure the object contains compater
public class Box implements Comparable<Box> {

  private int value;

  public Box (int value){
  this.value = value;
  }

  public int getValue(){
    return this.value;
  }
  

  //Compparable -> Disadvantages
  //1. you cannot define 2 sorting formula at the same time
  //2. the compareTo formula is for Box.class use only
  @Override
public int compareTo(Box box){
    //this (-1) vs box (1)
    return box.getValue()> this.value ?-1 : 1;  // reverse order

  }
  
 @Override
 public String toString(){
      return "Box (Value:" 
     + this.value
     +")";
   
 }
  
}
