package testCat;

public class testout {
  public static void main(String[] args) {



    
   Cat myCat = new Cat(); //<---new object
   myCat.Meow(); //< call the Meow method, non static method
   myCat.name= "Stelle"; // call the  .name 
   myCat.age=8;

   Cat myCat2 = new Cat();
   myCat.setName("benny");

 //Cat is a class, as kind of blueprint for creat objects
 //this Cat is a class  not a object, its not a cat object
 // so you can not call Cat.name; to create a cat to give it a name
 // first create a new cat, give the new cat a variable, here we call the new cat myCat
 //2. now we can put the value in myCat, .name, .age, .liveRemaining
 
  
 Cat.getcatCount(); //<------ how many cat we have created, use getter
 //Cat is a class, it can only call static methoed. 
 
 System.out.println(Cat.getcatCount()); //1

}
}
