import java.util.Arrays;

public class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public static Product linearSearch(Product[] products, String productId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId.equals(productId)) {
                return products[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String productId) {
        Arrays.sort(products, (p1, p2) -> p1.productId.compareTo(p2.productId));
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midProductId = products[mid].productId;
            if (midProductId.equals(productId)) {
                return products[mid];
            } else if (midProductId.compareTo(productId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product p1 = new Product("002", "Gadget", "Electronics");
        Product p2 = new Product("001", "Widget", "Tools");
        Product p3 = new Product("003", "Doodad", "Toys");
        Product[] products = { p1, p2, p3 };
        Product resultLinear = linearSearch(products, "001");
        System.out.println("Linear Search Result: " + (resultLinear != null ? "Product ID: " + resultLinear.productId + ", Name: " + resultLinear.productName + ", Category: " + resultLinear.category : "Product not found"));
        Product resultBinary = binarySearch(products, "003");
        System.out.println("Binary Search Result: " + (resultBinary != null ? "Product ID: " + resultBinary.productId + ", Name: " + resultBinary.productName + ", Category: " + resultBinary.category : "Product not found"));
    }
}