package inventory;

import java.util.ArrayList;
import java.util.List;

import observer.InventoryObserver;
import product.Product;


public class Inventory {
  private List<InventoryObserver> observers = new ArrayList<>();
  private List<Product> products = new ArrayList<>();

  public void addObserver(InventoryObserver observer) {
    if (observer == null) {
      throw new IllegalArgumentException("Observer cannot be null");
    }
    observers.add(observer);
  }

  public void notifyObservers(Product product) {
    for (InventoryObserver observer : observers) {
      observer.update(product);
    }
  }
  
  public void addProduct(Product product) {
    products.add(product);
    notifyObservers(product);
  }

  public void removeProduct(Product product) {
    products.remove(product);
    notifyObservers(product);
  }

  public void updateProduct(Product product) {
    int index = products.indexOf(product);
    if (index != -1) {
      products.set(index, product);
      notifyObservers(product);
    }
  }
  
}
