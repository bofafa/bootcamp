package ClassworkWeek3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ModelTimeSlot {
  // match the model with the brand
  // shoot 15 SKU need 60 mins
  // plan the time slot with Date of the week (time?? mo teaching about it yet)
  // --- DONE!!

  private Brand brand;
  private ModelList model;
  private int productQty;
  // private int hours;

  public ModelTimeSlot(Brand brand, ModelList model, int productQty) {// , int hours) {
    this.brand = brand;
    this.model = model;
    this.productQty = productQty;
    // this.hours = hours;

  }

  // getter
  private Brand getBrand() {
    return this.brand;
  }

  private ModelList getModel() {
    return this.model;
  }

  public int getProdcutQty() {
    return this.productQty;
  }

  public void setProductQty() {
    this.productQty = productQty;

  }

  public String checkMatching() {
    for (Brand brand : Brand.values()) {
      for (ModelList model : ModelList.values()) {
        if (this.getBrand().getStyles2().equals(this.getModel().getMatchStyle2())) {

        }

      }
    }
  }

  // if (this.getMatchStyle2().equals(this.getStyle())) {
  // System.out.println("oiu7y6tr");
  // return "true";
  // }
  // return "false";
  }

  // public int getHours() {
  // return this.hours;
  // }

  // public void setHours() {
  // this.hours = hours;
  // }

  // method
  // product Qty / 15pc = hour
  // int timeNeed = 0;this.hours=this.productQty/15;timeNeed=this.hours
  // public void modelTimeNeed ()

  public void checkBookingTime(LocalDate date1) { // <--- name 個method 係做乜？點用 check booking time
    LocalDate shootingDate = date1; //

    if (shootingDate.plusDays(6).getDayOfWeek().equals(DayOfWeek.SATURDAY) || // <---- .plus day is 6 days later, then
                                                                              // get day of week
        shootingDate.plusDays(6).getDayOfWeek().equals(DayOfWeek.SUNDAY)) { // <--- then checking if weekend, print out
                                                                            // warning
      System.out.println("oh no :( It's weekend, reschedule model booking"); // <----- print message
    }
    System.out.println("This is weekday, ok to book model, YAY :D ");

  }
  // shootingDate.plusDays(6).getDayOfWeek();
  // System.out.println(shootingDate.plusDays(6).getDayOfWeek()); // // model
  // photo shoot 6 days after prodcut shoot
  // System.out.println(shootingDate.plusDays(6));
  // if (shootingDate.plusDays(6).getDayOfWeek() == DayOfWeek.of(7) || //
  // shootingDate.plusDays(6).getDayOfWeek() == DayOfWeek.of(7)) {
  // System.out.println("This is weekend, reschedule model booking");
  // }
  // }

  public static void main(String[] args) {

    ModelTimeSlot model1 = new ModelTimeSlot(Brand.APC, ModelList.ALEX, 40);

    // System.out.println(ModelList.ALEX.getMatchStyle().equals(Brand.AMI.getStyle()));
    System.out.println("Check : ");
    model1.checkBookingTime(LocalDate.of(2024, 8, 27)); // <-- call method

    System.out.println("Check2 : ");
    model1.checkBookingTime(LocalDate.of(2024, 9, 1));

    LocalDate shootingDate = LocalDate.of(2024, 9, 15); // product shooting date
    shootingDate.plusDays(6).getDayOfWeek();
    // System.out.println(shootingDate.plusDays(6).getDayOfWeek()); // // model
    // photo shoot 6 days after prodcut shoot
    // System.out.println(shootingDate.plusDays(6));

    // if (shootingDate.plusDays(6).getDayOfWeek() == DayOfWeek.of(7) || //
    // shootingDate.plusDays(6).getDayOfWeek() == DayOfWeek.of(7)) {
    // System.out.println("This is weekend, reschedule model booking");
    // }

     if\
  }

}
