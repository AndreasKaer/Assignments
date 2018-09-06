
package liang_2_2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Liang_2_2 {

    public static void main(String[] args) {
        // This program that reads he length of a triangels sides and then computes 
        // area and volume of the tiangle
        double length; //Define length of sides
        
        // A Scanner objekt is created to read input
        Scanner keyboard = new Scanner(System.in);
        
        // Get the milse as a keyboard input
        System.out.print("Enter length of the side and height of the Equilateral triangle: ");
        length = keyboard.nextDouble();
        
        // Define sqrt (sqrt(3) / 4
        double x = sqrt(3) / 4;
        //double y = x / 4;
        
        // Convert length to area
        double area = x * Math.pow(length, 2);
        
        // Convert area and length to volume 
        double volume = area * length;
        
        // Displaying the inputted information 
        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + volume);
    }
    
}
