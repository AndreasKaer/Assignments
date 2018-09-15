
package opg_c4;

import java.util.Scanner;

public class Opg_C4 {

    public static void main(String[] args) {
        // Defining the days of the months as a array
        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Creating a scanner object and definiing a input
        Scanner input = new Scanner(System.in);
        int userInput;
        // Creating a while loop for calcualtion of the days from user input
        while (true){
            System.out.println("Enter a values correlating to a month: ");
            if (input.hasNextInt()){
            userInput = input.nextInt();
            if (!(userInput < 1 || userInput > 12)){
                System.out.printf("The number of days in the requested month is %d%n", month[userInput - 1]);
                break;
            }
            }
        
        }
            
        
        
    }
    
}
