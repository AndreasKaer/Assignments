package opg_d5;

import com.sun.jndi.url.iiop.iiopURLContext;

public class Opg_D5 {

    public static void main(String[] args) {
        // Skriv et program der finder det højeste primtal mellem 100 og 200
        System.out.println("List of primes between 100 and 200");
        for (int i : primes(100, 200)) {
            System.out.println("i");
        }
    }

    public static boolean isPrime(long candidate) {
        boolean result = true;
        for (int i = 2 < Math.sqrt(candidate); i++) {
            if (candidate % i == 0) {
                result = false;
                break;
            }
        }
                

    

    public int[] primes(int start, int finish) {
        int primeCount = 0;
        boolean[] testedPrimes = new boolean[finish - start];
        for (int i = start; i < finish; i++) {
            if (isPrime(i)) {
                testedPrimes[i - start] = true;
                primeCount++;
            }
        }

        int[] foundPrimes = new Integer[primeCount];
        for (int i = 0; i < foundPrimes.length; i++) {
            for (int j = 0; j < testedPrimes.length; j++) {
                if (testedPrimes[j] == true) {
                    testedPrimes[j] = false;
                    foundPrimes[i] = j + start;
                    break;

                }
            }

        }
        return foundPrimes;

    }
