
public class DemoSwitch {
  public static void main(String[] args) {
    int age = 19;
    boolean isAdult = false;
    if (age >= 18) {
      isAdult = true;
    }
    System.out.println("isAdult=" + isAdult);

    isAdult = false;
    // 1. if you do not "break" the switch case, the flow will go through all
    // cases.
    // 2. for case, you can only define one value for checking. No range
    // checking.
    // 3. "Switch" statment is only for finite scenario
    // 4. For "Switch", Java will check your case value, it alerts when there is duplicated.
    switch (age) {
      case 18:
        isAdult = true; //
        System.out.println("18");
        break;
      case 17:
        isAdult = false;
        System.out.println("17");
        break;
      case 16:
        isAdult = false;
        System.out.println("16");
        break;
    }
    System.out.println("isAdult=" + isAdult);

    //Example
    //switch -> case -> break -> last one is default
    
    String day = "sunday";
    switch (day) {
      case "Monday":
        System.out.println("it is weekday");
        // break; <---- 要加BREAK 搵到VALUE後先會停止 ，如果唔加BREAK會KEEP住 俾埋後面VALUE 
      case "Tuesday":
        System.out.println("it is weekday"); // print
        // break;
      case "Wednesday":
        System.out.println("it is weekday"); // print
        // break;
      case "Thursday":
        System.out.println("it is weekday"); // print
        break;
      case "Friday":
        System.out.println("it is weekday"); // print
        // break; 
      default:
        System.out.println("it is weekend"); // print
    }

//----self test-------

    String month = "Jan";
    switch (month) {
      case "Jan":
      System.out.println("it is 31 days");
      case "feb":
      System.out.println("it is 28 days");
      case "march":
      System.out.println("it is 31 days");
      break;
      case "april":
      System.out.println("it is 30 days");
      case "may":
      System.out.println("it is 31 days");
      default:
        System.out.println("it is 31 days");
    }





  }
}

//switch + break
//switch 似 IF 但用係較小數


