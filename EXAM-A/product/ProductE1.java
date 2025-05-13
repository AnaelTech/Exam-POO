package product;

public class ProductE1 implements Product {
  @Override
public String toString() {
    return getNom() + " (" + getIdentifiant() + "), " + getPrix() + "€, Catégorie: " + getDescription();
}


  @Override
  public String getNom(){
    return "iphone XS";
  }

  @Override
  public String getDescription(){
    return "electronique";
  }

  @Override
  public String getIdentifiant(){
    return "E1";
  }

  @Override
  public double getPrix(){
    return 600.0;
  }
}
