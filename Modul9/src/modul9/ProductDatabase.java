package modul9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase {

    // Creating a hashmap foor all the product in the database

    private final Map<Integer, Product> inventory = new HashMap<>();

    // Method to return all values from the map as a list
    public List<Product> getProductlist() {
        return new ArrayList<>(this.inventory.values());
    }

    // Adding a product to the database
    public boolean addProductByNumber(Product product) {
        return this.inventory.putIfAbsent(product.getProductID(), product) == null;
    }

    // Removing a product from the database
    public boolean removeProductByNumber(int number) {
        return this.inventory.remove(number) != null;
    }
    // Calculating the total value of all the products
    public double getInventoryValue(){
        return inventory.values().stream().mapToDouble(Product :: getPrice).sum();
    }
}
