package ClassworkWeek3.modelTimeSlot;

public enum BrandList { //
  APC ("cc", "")ca ,//cc= clean cut, ca = casaul
  AMI ("cc", "hi"), //hi = high fashion
  CDG ("jp", "hi"), //jp = Japan
  MIHARA("jp", "st"), //st = street wear
  ESSENTIAL ("st", " "),
  STONE_ISLAND("st", " ") ,
;

private String style;
private String style2; 

private BrandList (String style, String style2){
  this.style = style;
  this.style2 = style2;
}

public String getStyle(){
  return this.style;
}

public String getStyles2(){
  return this.style2;
}
 
}
 //public abstract class CreateSku{
//   // private String brandCode;
//   private String categorieCode;
//   private String itemCode;
//   private String colorCode;
//   private String sizeCode;

// public CreateSku (){

// }