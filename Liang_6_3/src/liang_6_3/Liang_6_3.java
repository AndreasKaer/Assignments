
package liang_6_3;

import java.util.Scanner;

public class Liang_6_3 {

    public static void main(String[] args) {
        // Print text to see if the integer is a Palindrome
        System.out.print("Input an integer to see if it is a Palindrome: ");
        // Taking an integer input from the console
        Scanner input = new Scanner(System.in);
        
        // defining the isPalindrome metod as a input
        boolean isPalindrome = isPalindrome(nextInt);
        System.out.println("The number " + input + "is" + (isPalindrome ? "" : "not ") + "a Palindrome");
    }
    // creating a int method to reverse an integer
    public static int reverse(int number){
        int reversed = 0;
        while (number != 0) {
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
            
        }
        return reversed;
    }
    // Creating a boolean method
    public boolean isPalindrome(int number) {
        boolean result = false;
        if (number == reverse(number)) {
            result = true;
        }
        return result;
    }

    
}
