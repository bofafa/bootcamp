package ClassworkWeek3;

public enum Brand { //
  APC ("cc", "ca") ,//cc= clean cut, ca = casaul
  AMI ("cc", "hi"), //hi = high fashion
  CDG ("jp", "hi"), //jp = Japan
  MIHARA("jp", "st"), //st = street wear
  ESSENTIAL ("st", " "),
  STONE_ISLAND("st", " ") ,
;

private String style;
private String style2; 

private Brand (String style, String style2){
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
 