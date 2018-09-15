package opg_c1;

public class Opg_C1 {

    public static void main(String[] args) {
        // Defining my array
        int[] radius = new int[]{1, 2, 3, 4, 5};

        // Defineing for-loop for the value "i" in the array
        for (int i = 0; i < radius.length; i++) {

            // Calculating the area
            double area = Math.PI * Math.pow(radius[i], 2);

            // Printing the result 
            System.out.println(" If radius is " + radius[i] + " then the area is " + area);
        }

    }

}
