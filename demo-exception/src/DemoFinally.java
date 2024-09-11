public class DemoFinally {
  public static void main(String[] args) {
    try{
      "abc".charAt(3);
    }catch (StringIndexOutOfBoundsException e){
      System.out.println("catch the exception");
    }finally{
      System.out.println("finally....");
    }
     System.out.println("main() ends......");
  }
}
