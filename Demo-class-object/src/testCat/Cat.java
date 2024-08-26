package testCat;

  //********Static vs non Static Variables and Methods************ 
   //-non static:  if the method for the individual object and instance of that class, 
   //or it have to be different of all object, use non static
   //- Static: something more of the class level, all objects in the class share the same value, 
   //   and something should be share with of all the class


   //****** This ************
    // "This" refer to the current object meaning it refers to the object that the methoed you're currently called on

public class Cat {
  
  private static int catCount = 0; //<-- static variable
   // static method for all objects in this class
   // private can't be changed in other classes , this static need to be control here in the class
   //command value shared amomg with all the objects of the cat class and isnt different per each individual car

 

//Constructor -- what do you need to create a cat
 public String name; // these are non static variable  // this its private, other class can not call it
 public int age;
 public int liveRemaining;

 public void setName(String name){ //<---- name
  this.name = name; //<---- this.name = line 27 name
 }

  public String getName(){
    return this.name;

  }
 
  public void setAge (int age){
    this.age =age;
  }

  public int getAge(){
    return this.age;
  }

 public void Meow(){  // cat object cann meow
   System.out.println("Meow");
}


 public Cat(){ // static method, set up line 5
 catCount++; // everytime a new cat is created we'll increment our cat count
 //keep track of the total cats we created
 }

 public static int getcatCount(){ //getter!!!!! it will use in other classes, 
  //so whenever want to use the catCount, we use getcatCount this variable. 
 return catCount;
 }
 //<---- 記得記得要俾 () 跟住{ 跟住return} // getter, setter and methoed 一定要有return


 //constants
public static void main(String[] args) {
  System.out.println("Meow");
}

}

