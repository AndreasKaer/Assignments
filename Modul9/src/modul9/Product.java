
package modul9;

public class Product {
    
    // Adding the attributes of the products
    public int productID;
    public String productName;
    public double price; 
    
    // Adding a contructor taking three aguments for the product
    public Product(int productID, String productName, double price){
        this.productID = productID;
        this.productName = productName;
        this.price = price;  
    }
    // Defining getters for all datafields
    public int getProductID(){
        return productID;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    
}
