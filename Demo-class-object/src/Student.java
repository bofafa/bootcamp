public class Student {
  private static String schoolName = "ABC school"; //Static ---> other the student object, belong to class but not belong to object 
  // public後可以周圍用 method call .schoolName //  one to many//

  private String name; // insdie the studednt object 
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
  //!!!!!Summary (static vs Instance)
  // Static method return instance varible (NOT OK - compile error)
  // Instance method return instance varible (ok)
  // static method return static variable (ok)
  // Instance method return static variable (ok)

  //!!!!!
  //Static method, static vatiable, static class do not belongs to object
  // so static stuff can be written to any class technically

  // instance method 
  public String info() {
    return "Student(" //
        + "name=" + this.name // instance variable
        + ", age=" + this.age // instance variable
        + ", school=" + schoolName // static variable
        + ")";
  }

  public static void main(String[] args) {
    Student s1 = new Student("John", 13);
    Student s2 = new Student("Jenny", 11);

    System.out.println(s1.info()); // Student(name=John, age=13, school=ABC school)
    System.out.println(s2.info()); // Student(name=Jenny, age=11, school=ABC school)

    Student.schoolName = "DEF school"; // !!!
    System.out.println(s1.info()); // Student(name=John, age=13, school=DEF school)
    System.out.println(s2.info()); // Student(name=Jenny, age=11, school=DEF school)

  }
}