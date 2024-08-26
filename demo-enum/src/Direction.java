public enum Direction { //<---=- 記得CALL enum
  EAST (1, 'E'), // <--- value number for direction relationship
  SOUTH (2, 'S'), // 
  WEST (-1, 'W'), //
  NORTH (-2, 'N'), //
  ;
  
 private int value;
 private char intital;

 private Direction (int value, char intital) {
  this.value = value;
  this.intital = intital;
 }

  public int getValue(){
  return this.value;
  }

  public int getIntital(){
    return this.intital;
  }


  public boolean isOppsite (Direction direction ){
    return this.value * -1 == direction.getValue();

    //if (this == direction)
    //return false;
    //if (this.getValue()%2== 1 && direction.getValue()%2==0)
    //|| 
    //return true;
  }


  public static void main(String[] args){
    // define a variable storing Directrion WEST
    Direction west = Direction.WEST;

    //check if this variable eqauls to NORTH
    //if yes, print "it is North."
    //if no, print "it is not North" 
 if(west == Direction.NORTH){
   System.out.println("It is North.");
 }else{
    System.out.println("It is not North.");
 }
  // valueOf()
  Direction east = Direction.valueOf("East");
  System.out.println(Direction.valueOf("south")); // case sensitive
  //runtime exception
 }

    if (west.isOppsite (Directrion.EAST)){ //true
      System.out.println("They are oppsite.");

    }
  }