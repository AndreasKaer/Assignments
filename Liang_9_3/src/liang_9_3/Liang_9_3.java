
package liang_9_3;

// importing the date class
import java.util.Date;

public class Liang_9_3 {

    public static void main(String[] args) {
        // First i create e new date object using the Date class
        Date date = new Date();
        
        // The i create an array with the given values for my elapsed time in milliseconds
        long[] elapsedTimes ={10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};
        
        // Now i loop the array using a enhanced for loop
        for(long elapsedTime : elapsedTimes) // Making a conditional operator
        {
            // I set the elapsed tiime of the date object
            date.setTime(elapsedTime);
            
            // Printing the elapsed time and the string value of the date object
            System.out.println("With an elspsed time of: " + elapsedTime + " Milliseconds.");
            System.out.println("The String value of the date object is: " + date.toString());
        }
    }
    
}
