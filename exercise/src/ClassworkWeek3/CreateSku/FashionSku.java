
package classwork - oop;
import java.util.Objects;

public class FashionSku extends CreateSku{ //<if this is error, 
  //because haven't override the method

  private double itemCode;
 // private double yearCode;


  public FashionSku (BrandCode brandCode, CategorieCode categorieCode, //
  double itemCode, ColorCode colorCode){ //<---brandcode, categoriecode
    super(); //<-- call parents method
    this.itemCode = itemCode;
   }
  

  
 public double getItemCode() { //<----- parent calss method and input getter
   return itemCode;
 }

 

  @Override
  public double newItemCode() {
  return itemCode +1;
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'newItemCode'");
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof FashionSku))
      return false;
      FashionSku fashionSku = (FashionSku) obj;
    return Objects.equals(super.getBrandCode(), fashionSku.getBrandCode())
        && Objects.equals(this.itemCode, fashionSku.getItemCode())
        && Objects.equals(super.getCategorieCode(), fashionSku.getCategorieCode())
        && Objects.deepEquals(super.getColorCode(), fashionSku.getColorCode());
  }
 
  @Override
  public int hashCode() {
    return Objects.hash(super.getBrandCode(), super.getCategorieCode(),//
    super.getColorCode(), this.itemCode);
  }

  
  @Override
  public String toString() {
    return "FashionSKU(" //
        +  super.getBrandCode() + super.getCategorieCode() + //
        + this.itemCode + super.getColorCode() + ")";
  }

  public static void main(String[] args) {
    FashionSku sku1 = new FashionSku(BrandCode.AMI, CategorieCode.DS, 2000, ColorCode.BLU);
    System.out.println(sku1.newItemCode());

  
    System.out.println("Fashion SKU" + sku1);
  }



  
}

