package observer;

import activity.ActivityLogger;
import product.Product;

public class SalesService implements InventoryObserver {
    private String name;

    public SalesService(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        ActivityLogger.getInstance().logActivity("SalesService " + name + " notified of product update: " + product);
        System.out.println("Service des ventes notifie");
    }

}
