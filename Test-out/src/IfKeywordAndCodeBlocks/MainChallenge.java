package IfKeywordAndCodeBlocks;

public class MainChallenge {

    public static void main(String[] args) {

      
    
       
    calculateScore(true, 800, 5, 100);
    calculateScore(true, 1000, 8, 200);




    }
// make Method
//void nothing return
    public static void calculateScore( boolean gameOver ,  int score,int levelCompleted ,int bonus ){
 

    int finalScore = score;

    if (gameOver){
        finalScore += (levelCompleted * bonus);
         finalScore +=1000;
        System.out.println("your final score was " +finalScore); //1300
    }
    }
}


