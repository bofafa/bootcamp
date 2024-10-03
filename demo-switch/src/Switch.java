public class Switch {
    public static void main(String[] args) throws Exception {
    String switchValue = "apple";
        switch (switchValue){
            case "1": 
                System.out.println("Value was 1");
                 break;

             case "2": 
                 System.out.println("Value was 2");
                  break;

          case "3": case "4": case "5":
          System.out.println(" was 3, 4, or 5");
          System.out.println(" actually it was a " + switchValue);
          break;
    default:
        System.out.println("was not the numne form 1-5, it was " + switchValue);

        break;

        }
        ////////////////////////

        int switchValue2 = 3;

        switch (switchValue2){
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("was a 3 , 4, or 5");
                System.out.println("actually it was a " + switchValue2);
               }
               default -> System.out.println("was not 1, 2 ,3, 4, 5, ");
        }
        String month = "hi";
        System.out.println( month + " is in the " + getQuarter(month) + " quarer of the year");

    }
   
    

    public static String getQuarter (String month){
        return switch (month){
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR","MAY","JUN" -> "2nd";
            case "JUL","AUG","SEP" -> "3rd";
            case "OCT","NOV","DEC" -> "4th";
            default -> {
                String badResponse = month + " is bad ";
                yield badResponse;
            }
            };
 };


 
    }

