package deck;

public class Suit {
  // Constant (static final)
  // Integer.MIN_VALUE -> constant
  public static final int DIAMOND = '♦';
  public static final int CLUB = '♣';
  public static final int HEART = '♥';
  public static final int SPADE = '♠';

  // static variable

  // instance variable
  private int value;

  // no public constructor
  private Suit(int value) {
    this.value = value;
  }

  // static method
  public static Suit valueOf(int value) {
    return new Suit(value);
  }

  public static Suit ofDiamond() {
    return new Suit(DIAMOND);
  }

  public static Suit ofClub() {
    return new Suit(CLUB);
  }

  public static Suit ofHeart() {
    return new Suit(HEART);
  }

  public static Suit ofSpade() {
    return new Suit(SPADE);
  }

  // instance method
  public int getValue() {
    return this.value;
  }

  public boolean isDiamond() {
    return this.value == DIAMOND;
  }

  public boolean isClub() {
    return this.value == CLUB;
  }

  public boolean isHeart() {
    return this.value == HEART;
  }

  public boolean isSpade() {
    return this.value == SPADE;
  }

  public int compareTo(Suit suit) {
    if (this.value == suit.getValue())
      return 0;
    return this.value > suit.getValue() ? 1 : -1;
  }

  public String toString() {
    return Character.toString( this.value);
  }

  public static void main(String[] args) {
    // card.getSuit().getValue() == 1
    // if (card.getSuit().isDiamond())
  }
}