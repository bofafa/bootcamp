

package customer;

import java.math.BigDecimal;
import java.util.Arrays;

public class Order { //<---- class
  private static int count = 0; //for ID numer 加數

  private int id; //attributes  system generate id
  private Item[] items; //attributes  one to many <--- items is a object , 
  private String currency; // attributes  one to one

  public Order() {  // constructor <
    this.id = getId();          //每次有個新NUMBER
    this.items = new Item[0]; // 默認Array係 0 

  }

  // public Order(Item[] items) {
  // this.items = items;
  // }

  // static method
  public static int getId() {   //<---- static method name is getId()
    return ++count;
  }

  // Method Signature: method name + parameter list (number + type)
  public void add(Item item) {    //<------- instance method
  
    Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1); //係Item Array 加格仔
    newItems[newItems.length - 1] = item;  //item== 將 item放係item array 最後一格 
    this.items = newItems; //this.item == 更新item array
  }

  public void remove(int index) { // i.e. length 4 -> length 3    index 係位置
    if (index > this.items.length - 1 && index >= 0) //<----  大過item 數量無野減，（ index 大過item array list）
      return;                                        // 無指令離開

    Item[] newItems = new Item[this.items.length - 1];  //<---- 
    int idx = 0;
    for (int i = 0; i < this.items.length; i++) {
      if (i != index) {
        newItems[idx++] = this.items[i]; 
      }
    }
    this.items = newItems;
  }

  public Item[] getItems() {
    return this.items;
  }

  public double totalValue() {
    // double + double -> BigDecimal
    BigDecimal total = new BigDecimal(0.0);
    for (int i = 0; i < this.items.length; i++) {
      total = total.add(BigDecimal.valueOf(this.items[i].subtotal()));
    }
    return total.doubleValue();
  }
}
