public enum Direction { //<---=- 記得CALL enum
  EAST, //
  SOUTH, //
  WEST, //
  NORTH, //
  ;
  
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
 }
    
  }