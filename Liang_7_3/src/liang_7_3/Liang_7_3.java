package liang_7_3;

import java.util.Scanner;

public class Liang_7_3 {

    public static void main(String[] args) {
        // Creating a scanner object
        Scanner input = new Scanner(System.in);

        // Definiing variables
        int userInput;
        int[] count = new int[50];
        // Requesting user input
        System.out.println("Enter the integer between 1 and 50 and end the input with 0");
        System.out.print("Enter your input here: ");

        // Creating while loop for the specified input
        while (true) {
            if (input.hasNextInt()) {
                userInput = input.nextInt();
                if (userInput != 0) { 
                    count[userInput - 1] += 1;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < count.length; i++){
            if (count[i] > 0){
                System.out.println((i + 1) + " occurs " + count[i] + " times");
            }
        }
    }

}
