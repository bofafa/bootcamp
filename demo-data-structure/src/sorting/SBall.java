package sorting;

import javax.script.Compilable;

public class SBall implements Comparable<SBall> {
  private Color color;
  private Name name;

  public SBall(Color color, Name name) {
    this.color = color;
    this.name = name;
  }

  public Color getColor() {
    return this.color;
  }

  public Name getName() {
    return this.name;
  }
  @Override
  public int compareTo (SBall sball){
     if (sball.getColor().getValue() == this.getColor().getValue()) {
      return sball.name.compareTo(this.name) ;
    
  }
      return( sball.getColor().getValue() > this.getColor().getValue() )? 1 : -1;
    }

  // @Override
  // public int compareTo(SBall sball) {
  //   if (sball.getColor().getValue() == this.getColor().getValue()) {
  //     return sball.getName().getValue() < this.getName().getValue() ? 1 : -1;
  //   }
  //   return( sball.getColor().getValue() > this.getColor().getValue() )? 1 : -1;
  // }

  @Override
  public String toString() {
    return "sBall's = ("
        + this.color
        + ","
        + this.name
        + ") ";
  }
}
