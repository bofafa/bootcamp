import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class DemoApplyLambdaFunction {
  public static void main(String[] args) {
    //for each
    List<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("ijk");
    for(String s : strings){
      System.out.println(s);
    }

    //for each
    strings.forEach(s-> System.out.println(s));

    List<Customer> cutomers = 
    Arrays.asList(new Customer(19), new Customer(30));
    //filter customre whose age>20, and print his age.
    cutomers.forEach (c -> {
      if(c.getAge() > 20)
      System.out.println(c.getAge());

    });

    Map<String, Integer> nameMap = new HashMap<>();
    nameMap.put("john", 30);
    nameMap.put("peter", 7);
    nameMap.computeIfAbsent("Betty", s -> 3);
    System.out.println(nameMap.get("better"));


    nameMap.merge("Betty", 10, (x1, x2) -> x1 *x2);
    
  }
}
