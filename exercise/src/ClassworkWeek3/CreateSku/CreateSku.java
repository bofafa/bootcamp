
public abstract class CreateSku{
   private BrandCode brandCode;
   private CategorieCode categorieCode;
// private String itemCode;
   private  ColorCode colorCode;
 //private String sizeCode; //sfds 
    
  public CreateSku (){
 };

 public CreateSku (BrandCode brandCode){ 
  this.brandCode = brandCode;
 }


 public CreateSku (BrandCode brandCode,ColorCode colorCode){ 
  this.colorCode=colorCode;
  this.brandCode = brandCode;
 }

  public BrandCode getBrandCode(){
    return this.brandCode;
  }
 
 public CreateSku (CategorieCode categorieCode){
  this.categorieCode = categorieCode;
 }

 public CategorieCode getCategorieCode(){
     return this.categorieCode;
 }

public CreateSku( ColorCode colorCode){
  this.colorCode = colorCode;
 }
  public ColorCode getColorCode(){
     return this.colorCode;
  }

  public String toString() {
  return "FashionSKU(" //
  +  brandCode  //
  + categorieCode //
  + colorCode //
  + ")";
}


  //public int itemCode;
  
public abstract double newItemCode();// method for all child class

  public static void main(String[] args) {
  
   //
  }
}
