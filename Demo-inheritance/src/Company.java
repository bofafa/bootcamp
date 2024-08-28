import java.time.LocalDate;
import java.util.Objects;

public class Company {
  private Staff2 staff;


  public Company (Staff2 staff){
    this.staff = staff;
  }

  public Staff2 getStaff() {
    return this.staff;
  }



  public boolean equals (Object obj){ // step 1 check  (address)
     if (this == obj)
     return true;
     if(!(obj instanceof Company)) //step 2 return flse
     return false;
      Company company = (Company) obj; // step 3 downcawst to target type 
      return Objects.equals(this.staff, company.getClass());
  }


   @Override
   public int hashCode(){
     return Objects.hash(this.staff);


   @Override
   public String toString(){
    return "Company ("//
          + "staff" + this.staff //
          + ")";
   }
   
  public static void main(String[] args) {
    System.out.println(LocalDate.of(2024, 1, 1).toString()); // 2024-01-01
    System.out.println(LocalDate.of(2024, 1, 1).equals(LocalDate.of(2024, 1, 1))); // true
    System.out.println(LocalDate.of(2024, 1, 1).equals(new Dog())); // false
  

    Company c1 = new Company(new Staff2("john", LocalDate.of(2024, 8, 9)));
    Company c2 = new Company(new Staff2("john", LocalDate.of(2024, 8, 9)));
  
    System.out.println(c1.equals(c2));
    System.out.println(c1 == c2); // false
  
  }





}