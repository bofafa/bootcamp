// public final class Person implements Walkable, Swimable {
// if the class is "final", it cannot be extended by subclass.
public class Person1 implements Walkable, Swimable {

  public Person1(String string, int i) {
    //TODO Auto-generated constructor stub
  }

  @Override
  public final void walk() { // after "final", walk() cannot be overriden.
    System.out.println("Person is walking ...");
  }

  @Override
  public void swim() {
    System.out.println("Person is swimming ...");
  }

  public static void main(String[] args) {
    Person1 p1 = new Person1();
    p1.swim();
    p1.walk();
  }

  public boolean isElderly() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isElderly'");
  }

  public int getAge() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAge'");
  }

}