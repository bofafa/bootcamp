package demo-nested-class.src;

public class Ball {
  private Ball.Color color;
  
  private enum  Color{
    RED, GREEN, BLUE,;
  }
  public enum Size{
    SMALL, MEDIUM, LARGE,;
  }
}
