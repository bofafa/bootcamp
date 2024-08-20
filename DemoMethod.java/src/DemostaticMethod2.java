public class DemostaticMethod2 {
  public static void main(String[] args) { // } <----------注意關括號，static 需平行，method 不可在 Static 內， 唔可以 2 個Static

    System.out.println("------ primitive 變做 warpper class------");
    int x = 10, y = 9;
    new Integer(10); // 將10 變做warpper class

    int a = 1;
    byte b = 2;
    int c = 3;
    // 9.longValue(); // not ok <---- 9 is not an object can not use method
    // .longValue()
    new Integer(9).longValue(); // <---- OK!! 9 is an object can use method == new Interger
    
    Long l1 =new Long(1); // <---- give a name to warpper class// l1 = 1
    Byte b1= new Byte(b);//  b1 = 
    byte b2 = new Byte(b);
    Double d1 = new Double(10.0);

    /// return Type: primitives + Warpper class + String
    /// void -> return nothing

  } // <----------注意括號，static 需平行，method 不可在 Static 內

  // Method Signature = Method Name + Number of Paramters & Type of Parameters
  // you can reuse the method name as they have different methoed signature
  public static int sum(int x, int y) {
    System.out.println("method x + y");
    return (int) x + y;
  }

  public static int sum(int x, int y, int z) {
    return x + y + z;
  }

  // calculate cycle Area <-------計circle method
  public static double calculateAreaForCircle(double radius) { // <------- 入口 NAME名
    return Math.pow(radius, 2.0) * Math.PI;
  }

  // calculate square Are <--------計square method
  public static double calculateAreaForSquare(double lenght) {
    return Math.pow(lenght, 2.0);
  }

  
}
