package sorting;

import javax.print.DocFlavor.STRING;

public enum Color { 
  RED(1),
  YELLOW(3),
  GREEN(2);
  
 private int value;

  private Color(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }
}
