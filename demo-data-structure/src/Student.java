import java.util.ArrayList;

public class Student {
  private String name;
  private ArrayList<Subject> subjects;

  public Student(String name, ArrayList<Subject> subjects) {
    this.name = name;
    this.subjects = subjects;
  }

  @Override
  public String toString() {
    return "Student(" //
        + "name=" + this.name //
        + ", subjects=" + this.subjects //
        + ")";
  }
}