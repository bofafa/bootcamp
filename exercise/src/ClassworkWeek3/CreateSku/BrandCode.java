package ClassworkWeek3.CreateSku - oop;

public enum BrandCode {
  APC ("APC"), //
  AMI ("AMI"),
  CDG ("CDG"),
  MIT ("MIHARA"),
  ESS ("ESSENTIAL"),
  STO ("ONE_ISLAND"),
  ;


  private String brandCode;

  private BrandCode (String brandCode){
    this.brandCode = brandCode;
  }

  public String getBrandCode(){
    return this.brandCode;
  }

 
  public static void main(String[] args) {
    System.out.println(BrandCode.AMI); //AMI

    


  }
}




