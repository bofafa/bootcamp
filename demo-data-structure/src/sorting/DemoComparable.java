package sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
  public static void main(String[] args) {
    
  
  int[] arr = new int[]{5, 10 ,2};
   Arrays.sort(arr);
   
int [] arr2 = new int []{ 5, -2,10,100 -100};
 Arrays.sort(arr2, 1, arr2.length);
 System.out.println(Arrays.toString(arr2));

 // how about the  reverse order
 List<Box> boxes = new ArrayList<>();
 boxes.add(new Box(3));
 boxes.add(new Box(-7));
 boxes.add(new Box(100));
 boxes.add(new Box(90));

 Collections.sort(boxes); // sort() -> call the box object's compareTo() meethod//
 //similar to ArrayList remove() -> your object's
 

List<Ball> balls = new ArrayList<>();
balls.add(new Ball(Color.YELLOW));
balls.add(new Ball(Color.RED));
balls.add(new Ball(Color.GREEN));
balls.add(new Ball(Color.RED));
balls.add(new Ball(Color.GREEN));

Collections.sort(balls);

System.out.println(balls);


List<SBall> sballs = new ArrayList<>();
sballs.add(new SBall(Color.YELLOW, Name.ALEX));
sballs.add(new SBall(Color.RED, Name.VINCENT));
sballs.add(new SBall(Color.GREEN, Name.BENNY));
sballs.add(new SBall(Color.YELLOW, Name.SUSAN));
sballs.add(new SBall(Color.YELLOW, Name.JOHN));

Collections.sort(sballs);

System.out.println(sballs);



}

}