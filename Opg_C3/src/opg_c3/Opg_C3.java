
package opg_c3;

public class Opg_C3 {

    public static void main(String[] args) {
        // Defining my temperatues in a array
        double[] allTemp = new double[]{21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};
        // Creating a for-loop that calculates the temperature differnce
        for(int i = 1; i < allTemp.length; i++){
            System.out.println(allTemp[i] - allTemp[i - 1]);
        }
    }
    
}
