
package liang_6_8;

public class Liang_6_8 {

    public static void main(String[] args) {
        // Defining miles and kiloometers
        double mile = 1;
        double kilometer = 20;
        System.out.printf("%-20s%-20s|%20s%20s%n", "Miles", "Kilometers", "Kilometers", "Miles");
        System.out.println("_________________________________________________________________________________");
        while (mile <= 10) {
            System.out.printf("%-20.2f%-20.2f|%20.2f%20.2f%n", mile, mileToKilometer(mile), kilometer, kilometerToMile(kilometer));
            mile += 1;
            kilometer += 5;
        }

        
        
    }
        // Metod for mile to kilometer
        public static double mileToKilometer(double mile) {
            double result = 0;
            result = mile * 1.6;
            return result;
        }
        // Metod for kilometer to mile
        public static double kilometerToMile(double kilometer){
        double result = 0;
        result = kilometer / 1.6;
        return result;
        
        }
        
        
        
        
}
