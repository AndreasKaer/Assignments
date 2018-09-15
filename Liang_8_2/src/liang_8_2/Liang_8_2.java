package liang_8_2;

import java.util.Scanner;

public class Liang_8_2 {

    public static void main(String[] args) {
        // Defining a scanner object
        Scanner input = new Scanner(System.in);
        // Defining my average value
        double average = 0;
        // Creating my matrix as a 4 x 4
        double[][] matrix = new double[4][4];
        // Creating a String array for the four lines in the matrix
        String[] numLine = new String[]{"first", "second", "third", "fourth"};
        // Entering the matrix values
        System.out.println("Enter a 4 by 4 matrix line by line");
        // Entering the numbers for the i rows
        for (int i = 0; i < 4; i++) {
            // Using printf to call my line name String (see chapter 4.6)
            System.out.printf("Enter the %s line :", numLine[i]);
            // Entering the numberfoir the j rows
            for (int j = 0; j < 4; j++) {
                // Setting both i and j as input        
                matrix[i][j] = input.nextInt();
            }
        }
        // Calculating the average of the major diagonal
        for (int i = 0; i < 4; i++) {
            average += matrix[i][i];
        }
        average = average / 4;
        System.out.println("The average of the elements in the major diagonal is " + average);
    }

}
