
package modul9;

import java.util.Date;

public class FoodProduct extends Product{
    
    // Creating datafeild for the types of produce
    private final Date expirationDate;
    private final double storageTemperature;

    // Creating coonstructor
    public FoodProduct(int productID, String productName, double price, Date expirationDate, double storageTemperature){
        super(productID, productName, price);
        this.expirationDate = expirationDate;
        this.storageTemperature = storageTemperature;        
    }
    // Creating getters
    public Date getExpirationDate(){
        return expirationDate;
    }
    public double getStorageTemperature(){
        return storageTemperature;
    }
    // Overide from object class
    @Override
    public String toString(){
        return super.getProductName() + " expires " + this.expirationDate.toString();
    }
    
}
