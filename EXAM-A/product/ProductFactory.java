package product;

public class ProductFactory {
  public static Product createProduct(String type) {
    switch (type) {
      case "A1":
        return new ProductA1();
      case "E1":
        return new ProductE1();
      case "V1":
        return new ProductV1();
      default:
        throw new IllegalArgumentException("Unknown product type: " + type);
    }
  }
}
