package arrayList.classInArraylist;

public class Shape {
  private String color;// 1.Attribute：Shape 需要有乜內容，設定 shape 有color

 public Shape (String color){ // 2.Constructor ： shape 要有color 先成立
    this.color= color;        //3.this.color, 即呢個class 用的color 係this color        
  }

  public void draw(){  //4. Method to draw the shape with its color
    System.out.println("Drawing a shape with color: " + color);
  }
  
    public String getColor(){ //5. Getter method to retrieve the color of the shape
      return this.color;
  }
  public void setColor(String color){ //6. // Setter method to update the color of the shape
    this.color = color;
  }

  
}
