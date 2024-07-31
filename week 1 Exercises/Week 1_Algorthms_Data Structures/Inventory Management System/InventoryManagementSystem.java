import java.util.*;

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class InventoryManager {
    private Map<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, String productName, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product product1 = new Product("001", "Bat", 10, 599.99);
        Product product2 = new Product("002", "Cycle", 20, 3499.99);

        manager.addProduct(product1);
        manager.addProduct(product2);

        System.out.println("Product 001: " + manager.getProduct("001").getProductName());

        manager.updateProduct("001", "Ball", 8, 199.99);
        System.out.println("Updated Product 001: " + manager.getProduct("001").getProductName());

        manager.deleteProduct("002");
        System.out.println("Product 002 after deletion: " + manager.getProduct("002"));
    }
}