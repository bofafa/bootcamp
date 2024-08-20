public class StringBox { 

  ///********create class === blueprint , Use method!!*************
  private char [] characters;
   //new string
  //1.attributes   2. constructor  3. intance method
  public StringBox (String s){ //<-------blue box

    
    // string -> char []
    this.characters = new char [s.length()]; //! <------- green box
    for ( int i=0 ; i < s.length(); i++){
      this.characters[i] = s.charAt(i);
    }
  }

    public char [] getCharacters(){
      return this.characters;
    }



     //design: revise the data of the object
     public void setCharAt (int index, char c){
        this.characters[index] = c;    
       }



  //sb.charAt
   public char charAt (int index){
    return this.characters[index];
     }

     public int length(){
      return this.characters.length;
     }
// first Index0f
     public int indexOf(char c){
      for (int i = 0; i< this.characters.length; i++){
        if (this.characters[i]==c){
        return i;
      }
      }
      return -1;
    }

    // replace
     public String replace (char o, char n){
      char [] arr= new char[this.characters.length];
      for (int i= 0 ; i < this.characters.length; i++) {
          arr[i] = this.characters[i] == o ? n : this.characters[i];
      }
      return String.valueOf(arr); // new String(arr)
     }

     public String suString (int beginIndex, int endIndex){
      char[] arr = new char[this.characters.length];
      for (int i = beginIndex ; i < endIndex; i++){
      arr[i] = this.characters[i];
     }
      return String.valueOf(arr);// char[]-> string
    }

     public String toString(){
      return String.valueOf(this.characters);

     }


  
 public static void main (String [] args){
  String s = new String("abc"); //<-----blue box
  StringBox sb = new StringBox("abc");
 




  System.out.println(s.charAt(1)); // b
  System.out.println(sb.charAt(1)); //b

  System.out.println(s.length());// 3
  System.out.println(sb.length());// 3

  System.out.println(s.indexOf('c')); //2
  System.out.println(sb.indexOf('c')); //2

  String newStr = s.replace('c', 'x');
  System.out.println(newStr); //"abx"
  System.out.println(s);//'abc' // =s.tostring()

  String newStr2 = sb.replace('c', 'x');
  System.out.println(newStr2); //"abx"
  System.out.println(sb);//'abc' // =s.tostring()

  //pass by reference
  StringBox sb2 = sb; // StringsBox object 
  //sb.setCharAt('a', 2);

  char[] arr =sb.getCharacters();
  arr[0] = 'm';




 }
  }
  
