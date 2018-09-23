
package liang_6_2;

import java.util.Scanner;

public class Liang_6_2 {

    public static void main(String[] args) {
        // DEfine a scanner object
        Scanner in = new Scanner(System.in);
        // Printing the line promting you to input data
        System.out.println("Enter an integer to sum the digits of: ");
        // defining a long value
        long value = in.nextLong();
        
    }
    // Creating a method
    public int sumDigits(long n){
        int temp = (int)Math.abs(n);
        int sum = 0;
        
        while(temp != 0){
            sum += (temp % 10);
            temp = temp / 10;
        }
        
        return sum;
    }
        
    
    
    
}
