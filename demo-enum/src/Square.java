import java.math.BigDecimal;

public class Square {
   private double length;
   private Color color;

   //getter and constructor
   public Square (double length, Color color ){
    this.length = length;
    this.color  = color;
  }
    //public static 
   
    public static Square ofRed (double length){
      return new Square(length, Color.ofRed());
    }

    public double getLength(){
       return this.length;
      }
         
      public Color getColor() {
        return this.color;
      }

      public double area() {
        return BigDecimal.valueOf(this.length)//
        .multiply(BigDecimal.valueOf(this.length))//
        .doubleValue();  // <----- double use BigDecimal, and use valueOf, at the end use double value
      }
   }

   public static void main (String [] args) {
    Square s1 = new Square(4.0d, Color.ofRed());
    System.out.println(s1.area());

    
    Square s2 = new Square(4.0d,  Color.ofRed());
    Square s3 = new Square(4.0d,  Color.ofRed());

    

   }