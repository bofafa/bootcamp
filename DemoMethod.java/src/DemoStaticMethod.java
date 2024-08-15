public class DemoStaticMethod {

  public static void main(String[] args) {



System.out.println( "-------------- Approach 1 --------------");
    
    // Approach 1:
    double radius1 = 1.3;
    System.out.println(radius1 * radius1 * 3.14);
    double radius2 = 1.4;
    System.out.println(radius2 * radius2 * 3.14);
    double radius3 = 1.5;
    System.out.println(radius3 * radius3 * 3.14);

        System.out.println( "-------------- Approach 2 --------------");
    // Approach 2:
    double [] radiusList =  new double[] {1.3, 1.4, 1.5};
    double area = 0.0;
    for (int i = 0 ; i < radiusList.length;i++) {
      area = radiusList[i] * radiusList [i] * 3.14;
      System.out.println(area);

}

System.out.println( "-------------- Approach 3 - -------------");
      // Approach 3:
      double [] radiusList2 =  new double[] {1.3, 1.4, 1.5};
      // sum up all cycle area
      double totalArea = 0.0;
      for (int i = 0; i < radiusList2.length; i++){
          totalArea += calculateCircleArea(radiusList2[i]); // <---- method name start with verb // method put in the bottom
          System.out.println(totalArea);

          }
       
       
        }
   

          // input (parameters) --- > abc


    /// if input is able to produce output, then its a static method. 
    // how to write method
    // cutom emethod
    //   public static double calculateCircleArea (double radius) { //<------- 入口 NAME名
    //return Math.pow(radius, 2.0) * Math.PI;//


  }  


 

   public static double calculateCircleArea (double radius) { //<------- 入口 NAME名
      return Math.pow(radius, 2.0) * Math.PI;
     }
