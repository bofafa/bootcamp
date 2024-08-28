package ClassworkWeek3.modelTimeSlot;

public enum ModelList{
  ALEX ('F' , 175, "jp", "ca"), //<--- String meaning look at enum Brand
  VIKA ('F', 176, "hi","cc"),
  AMY ('F', 173, "st", "ca"),
  SHEAN ('M', 185, "jp", "ca"),
  JAY ('M',189, "hi", "st"),
  ;

  private char gender;
  private int hight;
  private String matchStyle;
  private String matchStyle2;

  private ModelList (char gender, int hight, String matchStyle, String matchStyle2){
    this.gender = gender;
    this.hight = hight;
    this.matchStyle = matchStyle;
    this.matchStyle2 = matchStyle2;
  }

  public char getGender() {
    return this.gender;
  }

  public int getHight() {
    return this.hight;
  }

  public String getMatchStyle(){
    return this.matchStyle;
  }

   public String getMatchStyle2(){
    return this.matchStyle2;
   }
}


