package shape;

import java.util.Objects;

public class Point {
  private int x;
  private int y; //

  public Point (int x, int y) {
    this.x = x;
    this.y = y;
  }

    public int getX(){
      return this.x;
    }

   public int getY(){
    return this.y;
   }

  @Override
   public boolean equals(Object obj){
    if (this == obj)
    return true;
    if (!(obj instanceof Point))
    return false;
    Person person = (Point) obj;
    return Objects.equals(this.x, point.getX())
    &&r return Objects.equals(this.y , point.getY());
   }
  public static void main(String[] args) {
    
    Person person = new Person (new Point(1,2));
    if (person.getPoint().equals(new Point(1,2))) {}
  }
    
  }
  

