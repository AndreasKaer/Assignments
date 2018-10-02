
package modul9;

import java.util.Arrays;

public class NonfoodProduct extends Product{

    // Datefield for matertial used in nonfood product
    private final String[] materials;
    
    // Coonstructor takiing four arguments
    public NonfoodProduct(int productID, String productName, double price, String[] materials){
        super(productID, productName, price);
        this.materials = materials;
    }
    // Getter for the material array
    public String[] getMaterials(){
        return materials;
    }
    
    // Overides from object class
    @Override
    public String toString(){
        return super.getProductName() + " contains: " + Arrays.toString(this.materials);
    }
    
}
