
package opg_d2;

public class Opg_D2 {

    public static void main(String[] args) {
        // 
        double sum = 0;
        double[] radii = new double[]{3,7};
        for (double object : radii){
            sum += circleCircumference(object);
        }
        System.out.println("The sum of the circumferre is: " + sum);
        
    }
    public static double circleCircumference(double radius) {
        double result = 2 * radius * Math.PI;
        return result;
    }
}
