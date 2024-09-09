import java.util.PriorityQueue;

public class Person implements Comparable<Person1> {
  private String name;
  private int age;
  // private HKID hkid; // person.getHKID().getValue()

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  // public HKID getHKID() {
  //   return this.hkid;
  // }

  public int getAge() {
    return this.age;
  }

  public boolean isElderly() {
    return this.age >= 65;
  }

  @Override
  public int compareTo(Person1 person) {
    // this -1 vs person 1
    if (this.isElderly() && !person.isElderly())
      return -1;
    if (!this.isElderly() && person.isElderly())
      return 1;
    // compare age
    return this.age > person.getAge() ? -1 : 1;
  }

  @Override
  public String toString() {
    return "Person(" //
        + "name=" + this.name //
        + ", age=" + this.age //
        + ")";
  }

  public static void main(String[] args) {
    PriorityQueue<Person1> pq = new PriorityQueue<>();
    pq.add(new Person1("John", 50));
    pq.add(new Person1("Jenny", 65));
    pq.add(new Person1("Sally", 66));
    pq.add(new Person1("Vincent", 5));
    // System.out.println(pq);
    // poll() -> call compareTo()
    System.out.println(pq.poll()); // Person(name=Sally, age=66)
    
    pq.add(new Person1("Benny", 70));
    System.out.println(pq.poll()); // Person(name=Benny, age=70)
    pq.add(new Person1("Oscar", 13));
    System.out.println(pq.poll()); // Person(name=Jenny, age=65)
    System.out.println(pq.poll()); // Person(name=John, age=50)
    System.out.println(pq.poll()); // Person(name=Oscar, age=13)
    System.out.println(pq.poll()); // Person(name=Vincent, age=5)
  }
}