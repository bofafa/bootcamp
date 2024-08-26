package deck;

public enum Suit2 { //enum class .
  DIAMOND(1), // enum object () add value 
  CLUB(2),//
  HEART(3),//
  SPADE(4),//
  ;
  
   private final int value;

   private Suit2(int value){
      this.value = value;

   }

   public int getValue(){
    return this.value;
   }
   

  //
  public int compare(Suit2 suit){ //<--- compare method name
    //this vs suit
    if(this == suit)
    return 0;
    return this.value > suit.getValue() ? 1 :-1;

  }

    public static Suit2 get(int value ) { //public後可以周圍用
       for (Suit2 suit : Suit2.values()){
         if(suit.getValue()==value)
         return suit;

       }
   
    return null;
  }
}
