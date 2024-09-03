package sorting;

import java.util.ArrayList;
import java.util.List;

public class Ball implements Comparable <Ball>{
 private Color color;
 private int value;

 public Ball (Color color){
  this.color = color;
 }

 public Color getColor(){
  return this.color;
 }

public int getValue(){
  return this.value;
}


@Override
public int compareTo (Ball ball){
  return ball.getColor().getValue() <this.getColor().getValue() ?-1 : 1;
}

@Override
public String toString(){
       return "Ball's color ="
       +this.color
      + "";
    }
}

