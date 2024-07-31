package InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<Integer, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    public Product getProduct(int productId) {
        return inventory.get(productId);
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product product1 = new Product(1, "Laptop", 10, 800.0);
        Product product2 = new Product(2, "Smartphone", 20, 500.0);

        ims.addProduct(product1);
        ims.addProduct(product2);

        ims.displayInventory();

        product1.setPrice(750.0);
        ims.updateProduct(product1);

        ims.displayInventory();

        ims.deleteProduct(1);
        ims.displayInventory();
    }
}

// Output:

// Product{productId=1, productName='Laptop', quantity=10, price=800.0}
// Product{productId=2, productName='Smartphone', quantity=20, price=500.0}
// Product{productId=1, productName='Laptop', quantity=10, price=750.0}
// Product{productId=2, productName='Smartphone', quantity=20, price=500.0}
// Product{productId=2, productName='Smartphone', quantity=20, price=500.0}
