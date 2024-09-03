public class Person {
  private String name;

  // Getter for name
  public String getName() {
      return name;
  }

  // Setter for name
  public void setName(String name) {
      this.name = name;
  }

  public static void main(String[] args) {
      // Create an instance of the Person class
      Person person = new Person();

      // Set the value for the name attribute using the setter
      person.setName("Alice");

      // Retrieve the value of the name attribute using the getter
      String personName = person.getName();

      // Display the name of the person
      System.out.println("Person's name: " + personName);
  }
}