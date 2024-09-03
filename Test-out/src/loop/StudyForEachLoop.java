package loop;
public class StudyForEachLoop {
  
  public static void main(String[] args) {
    int numbers [] = {1,3,5,7,9};  //<--- array list
 
System.out.println("numbers in the array");
 for (int number: numbers ){   // <--- for each loop, the element name doesnt matter int can be "number" or i
       System.out.println(number);  // <--- print out array number


 }
 System.out.println("----------for loop find char from string-----------");
     String text = "hello world";
     char targetChar = 'o';
     boolean found = false;

       for(int i = 0; i < text.length(); i++){ //<---- must guve the length
       if (text.charAt(i) == targetChar){  //<---- what we shearching for ? 1. text, 2. charSS
        found = true;

       }
      }
       if (found){
       System.err.println("found target char '" + targetChar + "'");
      }else{
        System.out.println("cant find target char");
      }

      System.out.println("----------for  each loop find char from string-----------");
      int count = 0;
      for (char c : text.toCharArray()){
            if ( c == targetChar){
             found = true;
            }
      }
      if (found){
      System.out.println("found the target char '" + targetChar +"'" );
  }else{
    System.out.println("can not find target char");
  }

      System.out.println("----------for  each loop count-----------");
      int count2= 0;
      for (char c : text.toCharArray()){
            if ( c == targetChar){
              count2++;
            }
      }
      System.err.println( "number of 'o' found =" + count2 );

      System.out.println("----------for loop count-----------");
      int count3=0;
      for (int i = 0 ; i<text.length(); i++){
        if(text.charAt(i) == targetChar ){
          count3++;

        }
      }
      System.out.println("number of " + targetChar + " found =" + count3);


      
  }
}

