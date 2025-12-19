import java.util.*;
public class SortedProductPrices {
    public static void main(String[] args) {

        // Step 1: Creating a TreeSet to store product prices
        // TreeSet automatically sorts values in ascending order
        Set<Double> productPrices = new TreeSet<>();

        // Step 2: Addingg product prices having duplicates
        productPrices.add(499.99);
        productPrices.add(299.50);
        productPrices.add(999.00);
        productPrices.add(150.75);
        productPrices.add(299.50); // duplicate
        productPrices.add(1200.00);
        productPrices.add(89.99);
        productPrices.add(150.75); // duplicate
        // Step 3: Displaying automatically sorted prices
        System.out.println("Sorted Product Prices (TreeSet):");
        for (Double price : productPrices) {
            System.out.println(price);
        }
    }
}