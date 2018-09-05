
package liang_2_1;

import java.util.Scanner;

public class Liang_2_1 {

    public static void main(String[] args) {
        // This program converts miles to kilometers 1 mile = 1,6 kilomerters
        double miles; //Define miles
        
        // A Scanner objekt is created to read input
        Scanner keyboard = new Scanner(System.in);
        
        // Get the milse as a keyboard input
        System.out.print("Enter the number of miles");
        miles = keyboard.nextDouble();
        
        // Convert miles to kilometers
        double kilometers = miles * 1.60;
        
        // Displaying the inputted information 
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers");
    }
    
}
