package main;
import product.Product;
import product.ProductFactory;
import inventory.Inventory;
import activity.ActivityLogger;
import observer.SalesService;
import observer.WarehouseService;

public class Main {
    public static void main(String[] args) {
      

      Product ProductA1 = ProductFactory.createProduct("A1");
      
      Product ProductE1 = ProductFactory.createProduct("E1");
      
      Product ProductV1 = ProductFactory.createProduct("V1");
      
      Inventory inventory = new Inventory();

      inventory.addObserver(new SalesService("SalesService"));
      inventory.addObserver(new WarehouseService("WarehouseService"));


      inventory.addProduct(ProductA1);
      inventory.addProduct(ProductE1);
      inventory.addProduct(ProductV1);

      System.out.println("\n-----------------------Journal des activites-------------------------\n");
      for (String activity : ActivityLogger.getInstance().getActivityLog()) {
          System.out.println(activity);
      }
      System.out.println("\n---------------------------------------------------------------\n-");

    }
}
