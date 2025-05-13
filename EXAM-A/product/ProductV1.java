package product;


public class ProductV1 implements Product {
  
  @Override
public String toString() {
    return getNom() + " (" + getIdentifiant() + "), " + getPrix() + "€, Catégorie: " + getDescription();
}


  @Override
  public String getNom(){
    return "bonnet";
  }

  @Override
  public String getDescription(){
    return "vêtement";
  }

  @Override
  public String getIdentifiant(){
    return "V1";
  }

  @Override
  public double getPrix(){
    return 10.0;
  }
}
