
package opg_b1;

public class Opg_B1 {

    public static void main(String[] args) {
        
        
        // Defining and printing the for loop for calculation of the area
        System.out.println("Printing areas: ");
        for (int radius = 1; radius <= 5; radius++){
        
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println(" Radius " + radius + " equals to an area of: " + area);
        }
        
        
        
    }
    
}
