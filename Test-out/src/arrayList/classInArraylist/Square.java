package arrayList.classInArraylist;

public class Square extends Shape {
  private double length;
  

  public Square (String color, double length){
    super(color);
    this.length = length;
  }

  public double getLength(){
    return this.length;
  }

  public void setLength(double length){
    this.length = length;
  }
  @Override
  public void draw(){
    System.out.println("Drawing a square with side length " + length + " and color: " + getColor());
  }
}
