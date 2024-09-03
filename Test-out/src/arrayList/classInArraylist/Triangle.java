package arrayList.classInArraylist;

public class Triangle extends Shape{   //1. extends Shape, shape is the parent class


  private double base; // 1.Attribute：Triangle need base and height
  private double height;


  public Triangle(String color, double base, double height) { //2. Constructor 要跟返parent class, shape 有color, 呢度照跟
    super(color);   //call super(), 用返mother class 的color                               
    this.base= base;
    this.height = height;
  }

    //3.getter & setter
    public double getBase(){
      return base;
    }
    
     public void setBase (double base){
      this.base= base;
     }
     public double getHeight(){
      return this.height;
     }
     public void setHeight(double height){
       this.height= height;
     }
       //4.override

       @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + ", height " + height + " and color: " + getColor());
    }
     }