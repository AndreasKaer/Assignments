
package liang_2_23;

import java.util.Scanner;

public class Liang_2_23 {

    public static void main(String[] args) {
        
        // A Scanner objekt is created to read input
        Scanner input = new Scanner(System.in);
        
        // Get the miles as a keyboard input
        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();
        
        // Get miles per gallon as input
        System.out.println("Enter miles per gallon: ");
        double mpg = input.nextDouble();
        
        // Get price per gallon 
        System.out.println("Enter price per gallon: ");
        double price = input.nextDouble();
        
        // Coompute the cost of driving
        double costOfDriving = (distance / mpg) * price;
        
        // Display result 
        System.out.println("The coost of driving is $" + costOfDriving);
        
    
    }
    
}
