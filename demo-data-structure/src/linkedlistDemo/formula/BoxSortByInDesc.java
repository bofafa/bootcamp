package linkedlistDemo.formula;

import java.util.Comparator;

import sorting.Box;

public class BoxSortByInDesc implements Comparator <Box>{
  
  @Override
  public int compare(Box b1, Box b2) {
    //b1 (-1), b2(1)
    return b1.getValue() < b2.getValue() ? -1:1;
  }
  

}
