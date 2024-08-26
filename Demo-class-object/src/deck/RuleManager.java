package deck;

import java.util.Arrays;

public class RuleManager {

  public boolean isPair(Card card1, Card card2) {
    return new PairManager(card1, card2).isPair();
  }

  public boolean isThreeKind(Card card1, Card card2, Card card3) {
    return false;
  }

  public boolean isFullHouse(Card card1, Card card2, Card card3, Card card4, Card card5) {
    // counting 
    return false;
  }

  public static void main(String[] args) {

  
    RuleManager ruleManager = new RuleManager();
    boolean result = ruleManager.isPair(Card.valueOf(Rank2.ACE ,Suit2.CLUB) , Card.valueOf(Rank2.FOUR , Suit2.HEART));

    System.out.println(result);
  }
}