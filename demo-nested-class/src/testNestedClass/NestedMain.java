package testNestedClass;

public class NestedMain {
  public static void main(String[] args) {
    
  
  
  TestNested outer5 = new TestNested();
  outer5.heyThere();   
  
  TestNested.Innerclass inner = new TestNested.Innerclass();
  inner.whatshapp();
}
}