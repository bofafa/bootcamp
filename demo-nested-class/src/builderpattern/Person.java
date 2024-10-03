package builderpattern;

public class Person {
  private String name;
  private int age;

  // You can add other public constructor if required. 
  private Person ( Builder builder){
this.name = builder.name;
this.age = builder.age;
  }


  public static Builder builder(){
    return new Builder();
    
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;

  }

  public void setName (String name){
    this.name = name;
  }

  public void setAge (int age){
    this.age = age;
  }

  public static class Builder{
    private String name;
    private int age;

  public Builder name(String name){
    this.name = name;
    return this;
  }

  public Builder age (int age){
    this.age = age;
    return this;

  }
  
public Person build(){
  return new Person(this); // builder this name
}
  }

  public static void main(String[] args) {
    Person p = new Person(builder());
    p.setAge(40);
    System.out.println(p.getAge());

  

    // task 1: builder ()
    // tasl 2: build() ->return person object

    Person p2 = Person.builder()//
    .name ("peter") // set name
    .age(20)//  set age
    .build();// build () -> instance method -> return Person Object

    System.out.println(p2.getName()); //Peteer
    System.out.println(p2.getAge()); //20

    //Advantages/ Functionality of Builder Pattern:
    //1.Server different pattern of 
    //2.
    //3.

  }
}
