package ClassworkWeek3;

public class ModelPhoto {

  private String productSKU;
  private int modelPhoto;
  

  public ModelPhoto (String productSKU, int modelPhoto){
    this.productSKU = productSKU;
    this.modelPhoto= modelPhoto;

  
  }


  public void setProductSKU( String productSKU){
     this.productSKU = productSKU;
  }
  
  public String getProductSKU(){
    return this.productSKU;
  }

  public void setModelPhoto (int modelPhoto){
    this.modelPhoto = modelPhoto;
  }

  public int getModelPhoto(){
    return this.modelPhoto;
  }

  public String toString(){
  return " " + this.productSKU + " " + this.modelPhoto;
  }
 

}
