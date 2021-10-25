package be.intec;

import java.util.Arrays;

public class PrimeDemo {
    public static void main(String[] args) {
        int[] primes = new int[5000000];
        boolean[] primeCheck = new boolean[5000000];
        int primeIndex = 0;

        Arrays.fill(primeCheck, true);

        for (int number = 2; number < primeCheck.length; number++){
            if (primeCheck[number]){
                primes[primeIndex++] = number;
                for (int multiple = 2 * number; multiple < primeCheck.length; multiple += number){
                    primeCheck[multiple] = false;
                }
                System.out.println(number);
            }
        }
    }
}
