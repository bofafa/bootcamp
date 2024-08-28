package ClassworkWeek3.CreateSku;

public class FashionSku extends CreateSku{ //<if this is error, 
  //because haven't override the method

  private double itemCode;
 // private double yearCode;


  public FashionSku (BrandCode brandCode, CategorieCode categorieCode, //
  double itemCode, ColorCode colorCode){
    super(); //<-- call parents method
    this.itemCode = itemCode;
    //this.yearCode = yearCode;g
  }

  

  
  @Override
  public String toString() {
    return "Staff2(" //
        +  super.getBrandCode() + super.getCategorieCode() + 

  public static void main(String[] args) {
    FashionSku sku1 = new FashionSku(BrandCode.AMI, CategorieCode.DS, 2000, ColorCode.BLU);
    System.out.println(sku1.newItemCode());
    System.out.println(sku1.newItemCode(), BrandCode.AMI);
  
    System.out.println(sku1);
  }

}
