package com.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
public class Ball {
  private Color color;

   public static enum Color {
    RED, BLUE, BLACK
   }

public static void main(String[] args) {
  
  Ball ball = new Ball(Color.RED);
  ball.setColor(Color.BLACK);
  System.out.println(ball.getColor());


   

}
  }
