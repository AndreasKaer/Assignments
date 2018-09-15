package opg_c5;

public class Opg_C5 {

    public static void main(String[] args) {
        // Defining a boolean and variable
        boolean found;
        int lastPrime = 0;

        // Creating a for loop for finding all the prime numbers under 1000000
        for (int i = 3; i < 1000000; i += 2) {
            found = false;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    found = true;
                    break;

                }

            }
            // Fidiing the last prime between 0 and 1000000
            if (!found) {
                lastPrime = i;
            }

        }
        System.out.println(lastPrime);
    }

}
