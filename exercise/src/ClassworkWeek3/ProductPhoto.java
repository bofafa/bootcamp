package ClassworkWeek3;

public class ProductPhoto {

  private String productSKU;
  private int productPhoto;
  private int detailPhoto;

  public ProductPhoto(String productSKU, int productPhoto, int detailPhoto){
  this.productSKU = productSKU;
  this.productPhoto = productPhoto;
  this.detailPhoto = detailPhoto;
  }

  
  public void setProductSKU (String productSKU ){
    this.productSKU = productSKU;
  }

  
  public String getProductSku(){
    return productSKU;
  }

  public void setProductPhoto (int productPhoto){
    this.productPhoto = productPhoto;
  }
  
  public int getProductPhoto(){
    return productPhoto;
  }
  public void setDetailPhoto (int detailPhoto){
    this.detailPhoto = detailPhoto;
  }
  public int getDetailPhoto(){
    return this.detailPhoto;
  }

  public String toString(){
// int total = this.productPhoto + this.detailPhoto;
    return this.productSKU + " "+ this.totalproductphoto()+"" ;
  }


  public int totalproductphoto(){
     if(this.productPhoto + this.detailPhoto <5){
      System.out.println("product photos must have more than 5 photos.");
       return this.productPhoto + this.detailPhoto;
     }else{
       return  this.productPhoto + this.detailPhoto;

  }
}

}
  

 

