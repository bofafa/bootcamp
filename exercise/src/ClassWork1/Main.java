package ClassWork1;
public class Main {
  public static void main(String[] args) {

    Dress dress1 = new Dress();
    String brand = "AcneStudio";
    String productNumber = "1234";

    dress1.setBrand (brand );
    dress1.setProductNumber(productNumber);

    System.err.println("Dress 1 SKU:" + dress1.getSku());

    Dress dress2 = new Dress(); 
   
    dress2.setBrand ("APC");
    dress2.setProductNumber("4567");
    dress2.setcolor ("pink");
    dress2.setSize("M");

    System.err.println("Dress 2 FullSKU:" + dress2.getFullSku());

    
  }
  
}
