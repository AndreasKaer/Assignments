
package liang_6_25;

import java.sql.ResultSet;
import java.util.Scanner;

public class Liang_6_25 {

    public static void main(String[] args) {
        // Creating a scanner input
        Scanner input = new Scanner(System.in);
        // creating a while loop
        while (true) {
            System.out.print("Enter an integer value: ");
            if (input.hasNextLong()){
                System.out.println(convertMillis(input.nextLong()));
                break;
            }else{
                input.next();
            }
            
        }
    }
    // creating a String method
    public static String convertMillis(long millis){
            String results;
            long hours = millis / 3600000;
            long minutes = (millis % 3600000) / 60000;
            long seconds =((millis % 3600000) % 60000) / 1000;
            results = String.format("%d:%d:%d", hours, minutes, seconds);
            return results;
    }
    
   
}
