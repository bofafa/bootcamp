public class ExceptionChainExample2 {
  public static void main(String[] args) {
    method1 (10,0); 

    public static int method1 (int x , int y){
      return method2(x,y);
    }

    public static int method2 (int x, int y){
      try{ 
      return x/y;
    } catch (ArithmeticException e) {
      System.out.println("x /y is out of the range");
    }
  }
}
