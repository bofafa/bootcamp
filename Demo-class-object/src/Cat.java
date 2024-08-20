public class Cat { // <---class is blueprint，設計圖
  // attributes 俾形容 個system 可以做乜，system 需要，
  // class 同 class 之間溝通
  private String name; // <----- 一定要private, 外界改唔到
  private String color;
  private String age;
  // add instance method (object method)
  // getter

  public Cat(String name, String color, String age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) { // set <--- set 設定
    this.name = name;
  }

  public String getColor() { // <--- 我要查詢object 嘅資料
    return this.color;
  }

  public void setcolor(String color) {
    this.color = color;
  }

  public String getAge() {
    return this.age;

  }

  public void setAge(String age) {
    this.age = age;
  }
}
