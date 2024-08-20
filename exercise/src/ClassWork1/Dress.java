package ClassWork1;
public class Dress {

  private String brand;
  private String productNumer;
  private String color;
  private String size;

  //----------- getter / setter--------------------
  public String getBrand (){
    return this.brand;
  }
    public void setBrand (String brand){
      this.brand = brand;
    }

    public String getProductNumber (){
      return this.productNumer;
    }

    public void setProductNumber (String productNumber){
      this.productNumer = productNumber;
    }
       

   public String getColor(){
    return this.color;
      }

       public void setcolor (String color){
        this.color = color;
      }

    public String getSize(){
      return this.size;
        }

        public void setSize (String size){
          this.size = size;
        }
  
  
  //------------------method-------------------

  public String getSku(){
  return this.brand + this.productNumer;
  }


  public String getFullSku(){
    return this.brand + this.color + this.productNumer +this.size;
  }
}
