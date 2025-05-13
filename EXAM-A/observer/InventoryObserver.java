package observer;

import product.Product;

public interface InventoryObserver {
    void update(Product product);
}
