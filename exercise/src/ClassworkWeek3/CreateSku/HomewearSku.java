package ClassworkWeek3.CreateSku;

import java.util.Objects;

public class HomewearSku extends CreateSku{


  private double itemCode;

  public HomewearSku (BrandCode brandCode, double itemCode, ColorCode ColorCode){
  // super.getCategorieCode();
  // super.getColorCode();
  super(brandCode , colorCode); 
  this.itemCode = itemCode;
}


   public double getItemCode(){
    return itemCode;
   }

   
    double stocklist = 4512; //<-----hard code 

    

   @Override
   public double newItemCode() {    //<---- parent method, remeber to overdie it
     return itemCode = stocklist + 1;
    
   }

   @Override
   public boolean equals (Object obj){
    if (this == obj)
    return true;
    if (!(obj instanceof HomewearSku))
    return false;
    HomewearSku homewearSku = (HomewearSku) obj;
    return Objects.equals(homewearSku.getBrandCode(), super.getBrandCode())
   && Objects.equals(homewearSku.getColorCode(), super.getColorCode())
   && Objects.equals(homewearSku.getItemCode(), this.itemCode);
  
  }

   @Override
   public int hashCode(){
    return Objects.hash(super.getBrandCode(), super.getColorCode(), this.itemCode);
   }

   @Override
   public String toString () {
    return "HomewareSKU ("//
    + super.getBrandCode() 
    + this.itemCode
     + super.getColorCode()
     + ")";
   }

   public static void main(String[] args) {
    HomewearSku sku1 = new HomewearSku(BrandCode.STO, 3456 , ColorCode.RED);
    System.out.println("Homewear SKU =" + sku1);
  }
    }

    
   
