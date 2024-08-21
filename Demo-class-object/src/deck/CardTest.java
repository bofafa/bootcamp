package deck;

public class CardTest { 

// enum
  // Constant
  // Integer.MIN_VALUE -> constant
  public static final int DIAMOND = 1;
  public static final int CLUB = 2;
  public static final int HEART = 3;
  public static final int SPADE = 4;

  // !!! Make you know the difference between instance variable, static variable, static final variable

  // String -> good presentation, built-in equals() & compareTo()
  // "01", "02", "09, "10", "JACK", "QUEEN", "KING"
  private char rank; // 1, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K
  private String suit; // DIAMOND, CLUB, HEART, SPADE

  public CardTest(char rank, String suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public int compareTo(CardTest card) {
    if (this.getSuit() == card.getSuit())
      return this.getRank() > card.getRank() ? 1 : -1;
    else if (this.getSuit() == 'S')
      return 1;
    else if (this.getSuit() == 'H' && (card.getSuit() == 'C' || card.getSuit() == 'D'))
      return 1;
    else if (this.getSuit() == 'C' && this.getSuit() == 'D')
      return 1;
    return -1;
  }

  // get set
  public int getRank() {
    return this.rank;
  }

  public char getSuit() {
    return this.suit;
  }

  public static boolean compareSuit(CardTest card1, CardTest card2) {
    return false;
  }

  public static void main(String[] args) {


      CardTest c1 = new CardTest('1', "CLUB");
      CardTest c2 = new CardTest('1', "DIAMOND");
      CardTest c3 = new CardTest('1', "CLUB");
  
      System.out.println(c2.compareTo(c1)); // -1
      System.out.println(c1.compareTo(c2)); // 1
      System.out.println(c1.compareTo(c3)); // 0
  
      compareTwoCard(c1, c2); // 1
      compareTwoCard(c2, c1); // -1
      compareTwoCard(c1, c3); // 0
  
      System.out.println("32".compareTo("10")); //
  
      CardTest.CLUB = 10; // final variable cannot be modified
    }

  }


