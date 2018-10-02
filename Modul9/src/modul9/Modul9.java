
package modul9;

import java.util.Date;

public class Modul9 {

    public static void main(String[] args) {
        // Create a product database object
        ProductDatabase productDatabase = new ProductDatabase();
        
        // Creating oone of each product in the subclass
        FoodProduct foodProduct = new FoodProduct(1, "Apple", 2.5, new Date(System.currentTimeMillis() + 133000), 22);
        NonfoodProduct nonfoodProduct = new NonfoodProduct(2, "Toaster", 150, new String[]{"Frame", "Power", "Heat"});
        
        System.out.println("");
        
        // Printing their ooveride toString methods
        System.out.println("Priting toString methods:");
        System.out.println(foodProduct);
        System.out.println(nonfoodProduct);
        
        System.out.println("");
        
        // Adding prooducts to database and printing a success message if correct
        if (productDatabase.addProductByNumber(foodProduct)){
            System.out.println(foodProduct.getProductName() + " was succesfully added to the database!");
        }
        if (productDatabase.addProductByNumber(nonfoodProduct)){
            System.out.println(nonfoodProduct.getProductName() + " was succesfully added to the database");
        }
        
        System.out.println("");
        
        // Printing the product list by getting the list from the database
        System.out.println("Product List: ");
        for (Product product : productDatabase.getProductlist()){
            System.out.println(product.getProductID() + ", " + product.getProductName());
        }
        
        System.out.println("");
        
        // Printing the total value of all the products in the database
        System.out.println("Current inventory value: " + productDatabase.getInventoryValue());
    }
    
}
