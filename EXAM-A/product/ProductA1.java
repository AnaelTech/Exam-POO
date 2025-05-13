package product;
public class ProductA1 implements Product {
    @Override
public String toString() {
    return getNom() + " (" + getIdentifiant() + "), " + getPrix() + "€, Catégorie: " + getDescription();
}


  @Override
  public String getNom(){
    return "pain";
  }

  @Override
  public String getDescription(){
    return "alimentaire";
  }

  @Override
  public String getIdentifiant(){
    return "A1";
  }

  @Override
  public double getPrix(){
    return 1.0;
  }
}
