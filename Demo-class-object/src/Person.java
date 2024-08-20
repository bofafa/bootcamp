public class Person {
  private String name;
  private int age;

  // default empty constructor, only if you did not creaete another constructor
  // emptu, all-arg
  public Person (String name, int age) {
    this.name = name;
    this.age = age;
      }

      //you can just read the attribute from object, if there is no setter.
      //you cannot override/ rewrite the atrbute anymore after object creation. 
      public String getName(){
        return this.name;
      }
      
        public String getAge(){
          return this.age;
        }
      
      //Testing
      public static void main(String[] args) {
        //memory
        // when you create one all-ary contsructor only, 
        //compiler whould not creat the empty constructor for you anymore.
        // Person person = new Person(); // compile erroe
        
        Person person = new Person( "john",66);

      }
}
