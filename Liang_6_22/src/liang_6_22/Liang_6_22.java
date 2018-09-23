
package liang_6_22;

import java.util.Scanner;

public class Liang_6_22 {

    public static void main(String[] args) {
        // Defining scanner input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        if (input.hasNextLong()){
            System.out.println("The square root is " + sqrt(input.nextLong()));
        }
        
        
        
    }
    public static double sqrt(long n){
        double result = 0;
        double lastGuess = n;
        double nextGuess = n;
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n /lastGuess)) / 2;
                    
        }while (Math.abs(nextGuess - lastGuess) > 0.00000000001);
        result = lastGuess;
        return result;
    
    
    }
}
