package liang_5_5b;

public class Liang_5_5B {

    public static void main(String[] args) {
        // Display table
        System.out.println(
                "Celsius     Fahrenheit     |     Fahrenheit     Celsius\n"
                + "----------------------------------------------------------");
        // Loop from 0-100(inclusive) celsius.
        for (double celsius = 0; celsius <= 100; celsius += 2) {
            double fahrenheit = 20 + celsius / 2 * 5;
            {
                System.out.printf("%-12.1f", celsius);
                System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
                System.out.printf("     %-15.1f", fahrenheit);
                System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit));
            }
        }    
    

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);

    }
}
