public class LinearSearch {
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Phone", "Electronics"),
            new Product(2, "Honey", "Health & Beauty"),
            new Product(3, "TubeLight", "Appliances"),
            new Product(4, "Tab", "Electronics")
        };

        int targetId = 3;
        Product result = linearSearch(products, targetId);
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Product not found.");
        }
    }
}
