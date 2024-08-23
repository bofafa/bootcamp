import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecima {
  public static void main(String[] args) {
    // A special type in java
    //problem (double, float in math operation +, - ,*,/)

    System.out.println(0.2+0.1); // 0.3000000000001


    double x = 0.2 +0.1;
    if (x==0.3){
      System.out.println("x=0.3");
    }else{
      System.out.println("x!=0.3");
    }

    System.out.println("--------------double sum +------------");
    // BigDecimal (double)
    BigDecimal bd1 = new BigDecimal("0.2");
    BigDecimal bd2 = new BigDecimal("0.1");
    //instrance method for Math operations
    double result =bd1.add(bd2).doubleValue(); //<------------remenber  .doubleValue === 0.0 .intValue==0
    System.out.println(result);//0.3

    System.out.println("--------------double multiply * ------------");
    //multiply
    double result1 = bd1.multiply(bd2).doubleValue();
    System.out.println(result1); // 0.02
    System.out.println(bd1.multiply(bd2).doubleValue()); //0.02 
    System.out.println(bd1.multiply(bd2).intValue()); //0

    System.out.println("--------------subtract  -  ------------");
   System.out.println(bd1.subtract(bd2).doubleValue());//0.1

   System.out.println("--------------divide  -  ------------");
    // for most the case you should start with a double value
    bd1 = BigDecimal.valueOf(10);
    bd2 = BigDecimal.valueOf(3);
    System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP).doubleValue()); //3
    System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP));//3.33 <----- 中間2 = 小數後2個位
    System.out.println(bd1.divide(bd2, 2, RoundingMode.CEILING));//3.34<----- celing 封頂 


    System.out.println("-------------use BigDecimal in method------------");
    double m = 0.0;
    if (m == 0.0) {
      result = 0.0;
    }else{
      result = bd1.divide(BigDecimal.valueOf(m),2, RoundingMode.HALF_UP).doubleValue(); //call method, divide <-- 
    }
    System.out.println(result);



    System.out.println(BigDecimal.valueOf(3.4444).setScale(2, RoundingMode.UP)); //3.45 <-----第三個位有數就會加1 去第2個位
    System.out.println(BigDecimal.valueOf(3.444444).setScale(2,RoundingMode.HALF_UP));//3.45 <half up 四擔五入

    System.out.println("-------------use BigDecimal equals ----------");
      System.out.println(BigDecimal.valueOf(10L).equals(BigDecimal.valueOf(10.0)));//<------ false, becasue its different type
      System.out.println(BigDecimal.valueOf(10).equals(BigDecimal.valueOf(10)));// true
      System.err.println(BigDecimal.valueOf(10L).doubleValue()==BigDecimal.valueOf(10.0).doubleValue());//ture

      System.out.println("-------------use BigDecimal compareTo  ----------");
      System.out.println(BigDecimal.valueOf(10L).compareTo(BigDecimal.valueOf(10.0))); // 0
      System.out.println(BigDecimal.valueOf(11).compareTo(BigDecimal.valueOf(10.0))); // 1
      System.out.println(BigDecimal.valueOf(9).compareTo(BigDecimal.valueOf(10.0))); // -1
    }

  }
  

