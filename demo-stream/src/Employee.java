public class Employee {
  private String name;
  private int salary;

  public Employee (String name, int salary){
    this.name = name;
    this.salary = salary;
  }

  public String getName(){
    return this.name;
  }
  public int getSalary(){
    return this.salary;
}
@Override
public String toString() {
  return "Employee(" //
      + "name=" + this.name //
      + ", salary" + this.salary //
      + ")";
}
}