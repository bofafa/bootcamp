package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public abstract class Shape {
  private Color color;

  abstract double area();

  //with generic (lower boundary v- <T extend shape>)
  public static<T extends Shape> double totalArea(List<T> shapes){
  BigDecimal bd = BigDecimal.valueOf(0.0);
  for (Shape shape : shapes ){
     bd= bd.add(BigDecimal.valueOf(shape.area()));
  }
  return bd.doubleValue();
  }


  //with generic (upper boundary v- <? supedr shape>)
 public static double totalArea3 (List<? super Shape> shapes){

 }

  //without  generic
  public static double totalArea2(List<Shape> shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes ){
       bd= bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
    }


    public static void main(String[] args) {
      //without generics
      List <Shape> shapes = new ArrayList<> (
        

      )
    }

}
