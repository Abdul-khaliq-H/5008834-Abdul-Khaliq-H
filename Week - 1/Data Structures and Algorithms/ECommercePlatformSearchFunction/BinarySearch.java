package ECommercePlatformSearchFunction;

import java.util.Arrays;

public class BinarySearch {
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == targetId) {
                return products[mid];
            }

            if (products[mid].getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Book", "Books"),
            new Product(4, "Headphones", "Electronics"),
            new Product(5, "Shoes", "Fashion")
        };

        // Sort the array by productId for binary search
        Arrays.sort(products, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));

        int targetId = 3;

        Product resultLinear = LinearSearch.linearSearch(products, targetId);
        System.out.println("Linear Search Result: " + resultLinear);

        Product resultBinary = BinarySearch.binarySearch(products, targetId);
        System.out.println("Binary Search Result: " + resultBinary);
    }
}

// Output:

// Linear Search Result: Product{productId=3, productName='Book', category='Books'}
// Binary Search Result: Product{productId=3, productName='Book', category='Books'}
