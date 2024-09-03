package testCat;

public class Dog {
  String name;
  int age;


  void doginfo(){
  System.out.println(name);
  System.out.println(age);

  }
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.age = 5;
    dog1.name = "benny";

   dog1.doginfo();
  }
}


