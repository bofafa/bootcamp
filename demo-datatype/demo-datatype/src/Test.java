public class Test {
  public static void main(String[] args) {
    int k = 0;
    int o = k++ +3;
    System.out.println(k);
    System.out.println(o);

    String  day = "wednesday";
    if ("sunday".equals(day) || "staurday".equals(day)) {
      System.out.println(day + " is weekend");
    } else {
      System.out.println(day + " is weekday");
    }
    // Example 4
    String day2 = "wednesday";

    // "wednesday is weekday"
    // "sunday is weekend"
    // " staurday is weekend"

    if ("sunday".equals(day2) || "staurday".equals(day2)) { // wednesday = weekday x= weekend
      System.out.println(day2 + " is weekend");
    } else 
      System.out.println(day2 + " is weekday"); {

      }
    }
  }


