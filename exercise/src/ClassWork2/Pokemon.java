package ClassWork2;

public class Pokemon{
    private static String trainer = "bo"; //<----- one to all

  private String name;  // <----- one to one
  private int HP;

  public Pokemon (String name, int HP) {
    this.name = name;
    this.HP = HP;
  }

  public String getName(){
    return this.name;

  }
  

  public String info() {   //<-----instance method
    return "Pokemon ("//
     + "Name =" + this.name//
      +", HP = " + this.HP //
       + ", PokemonBallBelongTo =" + trainer //
       +")";
  }
    

   public static void main(String[] args) {
      Pokemon p1 = new Pokemon ("Pikachi", 100);
      Pokemon p2 = new Pokemon ("Charman", 98);
     
 
     System.out.println(p1.info());
     System.out.println(p2.info());
      //Pokemon (name =Pikachi, HP = 100, PokemonBallBelongTo =bo)
      //Pokemon (name =Charman, HP = 98, PokemonBallBelongTo =bo)
 
     Pokemon.trainer= "Ash";
     System.out.println(p1.info());
     System.out.println(p2.info());
     //Pokemon (Name =Pikachi, HP = 100, PokemonBallBelongTo =Ash)
     //Pokemon (Name =Charman, HP = 98, PokemonBallBelongTo =Ash)

        
    }
  }



