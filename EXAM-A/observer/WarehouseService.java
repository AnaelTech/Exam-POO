package observer;

import product.Product;
import activity.ActivityLogger;

public class WarehouseService implements InventoryObserver {
  private String name;

  public WarehouseService(String name) {
    this.name = name;
  }

  public void update(Product product) {
    ActivityLogger.getInstance().logActivity("WarehouseService " + name + " notified of product update: " + product);
    System.out.println("Service magasin notifie");
  }
}
