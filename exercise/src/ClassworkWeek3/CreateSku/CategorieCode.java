package ClassworkWeek3.CreateSku;


public enum CategorieCode {
  TP ("top"),
  SK ("skirt"),
  PT ("pants"),
  DS ("Dress"),
  AC ("Accessories"),
  ;

  private String categorieCode;

  private CategorieCode (String categorieCode){
    this.categorieCode = categorieCode;
  }
  

  
}
