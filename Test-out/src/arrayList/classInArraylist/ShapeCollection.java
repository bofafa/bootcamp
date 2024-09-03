package arrayList.classInArraylist;
import java.util.List;

import OOPselfTest.Circle;

import java.util.ArrayList;

public class ShapeCollection{
  private List<Shape> shapes; //new List name shapes

  public ShapeCollection(){
    shapes = new ArrayList<>();  // new arraylist name shapes
   }

//method to add shaps to Shape ArrayList:
public void addShape (Shape shape){ // creat a new name for method "addShape", use class Shape and method shape
  shapes.add(shape);                 // shapes is a arraylist, put Shape class shape in ArrayList
}
// Method to draw all shapes in the collection
public void drawAllShapes() {   
  for (Shape shape : shapes) {
      shape.draw(); // Polymorphic method call to draw each shape
  }

   public double getTotalArea(){
    double totalArea = 0.0;
    for (Shape shape: shapes){
      if(shape instanceof Triangle){
        totalArea += 0.5 * ((Triangle) shape).getBase() * ((Triangle) shape).getHeight();
        return totalArea;
    }
   }

  
}
public static void main(String[] args) {
  ShapeCollection collection = new ShapeCollection();
  Triangle triangle = new Triangle("Green", 6.0, 4.0);    // Create instances of various shapes
  Square square = new Square("Yellow", 5.0);

  collection.addShape(triangle);  // Add shapes to the collection
  collection.addShape(square);

  collection.drawAllShapes(); // Draw all shapes in the collection
}
}
