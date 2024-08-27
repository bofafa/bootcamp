package ClassworkWeek3;


public class EcommPhoto {
  private static String BrandoftheProduct = "Acne Studio";

  private static int ecommPhotoCount = 0;   //how many set of ecomm photos are ready

  private String sku; // SKU of photo set and prduct
  private ProductPhoto product; // product SKU, product photos and detail photos
  private ModelPhoto model;// product SKU and Model photo
  

  public EcommPhoto (String sku, ProductPhoto product, ModelPhoto model){ // one set of photo
    this.sku = sku;
    this.product = product;
    this.model = model;
    ecommPhotoCount++;
  }

  
 


  //getter

  public String getSKU(){
    return this.sku;
   }

   public void setSKU(){
    this.sku= sku;
   }
   
  public ProductPhoto getProduct(){
    return this.product;
  }

  public ModelPhoto getModel(){
    return this.model;

  }

   
   
    

  //public static EcommPhoto photoset (String SKU, ProductPhoto product, ModelPhoto model){
    //return EcommPhoto photoset(SKU, product, model);
  //}


   public boolean isCheckSet (ProductPhoto productPhoto) { // one set of photo
    if (this.sku !=  sku || this.sku != product.getProductSku() || this.sku != model.getProductSKU()) 
      System.out.println("Sku not matched");
      return false;
      

    }
   public boolean isCheckSet (ModelPhoto modelPhoto) { // one set of photo
    if (this.sku !=  sku || this.sku != product.getProductSku() || this.sku != model.getProductSKU()) 
      System.out.println("Sku not matched");
      return false;
      
      
    }

 
  public String toString() {
    return " (SKU = " + this.sku +
           ", Product photo = " + this.product +
           ", Model photo = " + this.model +
           ")";
}

  public static void main(String[] args) {
    String test = "abc";
    ProductPhoto productPhoto = new ProductPhoto(test, 1, 2);
    ModelPhoto modelPhoto = new ModelPhoto(test, 3);
    EcommPhoto set1 = new EcommPhoto ("abc", productPhoto, modelPhoto);
    EcommPhoto set2 = new EcommPhoto (test, productPhoto, modelPhoto);
    System.out.println(BrandoftheProduct + set1);
    System.out.println(BrandoftheProduct + set2);
    
    //EcommPhoto testing = new EcommPhoto();
    //System.out.println(ecommPhotoCount);
    
    System.out.println("Total EcommPhotos folder created: " + ecommPhotoCount);
  }
  
  }
