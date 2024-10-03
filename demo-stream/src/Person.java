public class Person {
  private int age;
  private String name;
  private String gender;

  public Person (int age, String name ){
    this.age=age;
    this.name=name;
  }

  public Person ( String name, String gender ){
    this.name=name;
    this.gender= gender;
  }


  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;


  }

  public String getGender(){
    return this.gender;
  }

  @Override
  public String toString(){
    return "Person (name="
    + this.name
    + ", age="
    + this.age
    +")";
  }
}
