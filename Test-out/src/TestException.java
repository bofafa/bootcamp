package Test-out.src;

public class TestException {
  public static void main(String[] args) {
  
    try{
    getInt();
  }
  catch (Exception e){
    System.out.println("not ok");
  }
  }
  public static void getInt(){
    int myInt = Integer.parseInt("pants");
  }

}

