
package liang_2_6;

import java.util.Scanner;

public class Liang_2_6 {
    private static Object input;

    public static void main(String[] args) {
        
        // A Scanner objekt is created to read input
        Scanner input = new Scanner(System.in);
        
        // Get the milse as a keyboard input
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();
        
        int firstDigit = num % 10;
        int remainingNumber = num /10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + secondDigit + firstDigit + fourthDigit;
        System.out.println("The multiplication of all numbers in " + num + " is " +sum);
      
    }
    
}
