
package liang_c6;

public class Liang_C6 {

    public static void main(String[] args) {
        // Write a program that print the index of the biggest number in a array
        double[] inputArray = new double[]{23.4, 45.7, 19.8, 2.9, 95.3};
        double highest = 0;
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] < highest){
                highest = inputArray[i];
            }
        
        }
    }
    
}
