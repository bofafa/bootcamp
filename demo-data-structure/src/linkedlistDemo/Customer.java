package linkedlistDemo;

public class Customer {
  private String name;
  private int age;

  public Customer(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {  // <----必需Override String
    return "Customer(" //
        + "name=" + this.name //
        + ", age=" + this.age //
        + ")";
  }
}