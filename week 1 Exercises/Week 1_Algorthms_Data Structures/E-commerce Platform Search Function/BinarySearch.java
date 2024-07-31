import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Product midProduct = products[mid];
            if (midProduct.getProductId() == targetId) {
                return midProduct;
            } else if (midProduct.getProductId() < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shampoo", "Health & Beauty"),
            new Product(3, "Coffee Maker", "Appliances"),
            new Product(4, "Smartphone", "Electronics")
        };

        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        int targetId = 3;
        Product result = binarySearch(products, targetId);
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Product not found.");
        }
    }
}
