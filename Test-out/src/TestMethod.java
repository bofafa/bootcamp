public class TestMethod {
  //Parameter and arguments are terms that are often used interchangeably by developers.
  //but technically , a parameter is the definition as shown in the methiod declration and the arguments
  //wil be the value that's passed to the methoed when we call it. 
  
  public static void main(String[] args) {
    boolean gameOver= true;
    int score =800;
    int levelCompleted =5;
    int bouns =100;

    int finalScore = score;

    calculateScore(boolean true, int score, int levelCompleted, int bouns );

    
  }
  
  public static void calculateScore(){
  

    int finalScore = score;

    if (gameOver){
      finalScore+= (levelCompleted *bouns);
      finalScore += 1000;
      System.out.println("your final score was" + finalScore);

  }
}

