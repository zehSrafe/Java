package be.intec;

import java.util.Arrays;

public class Opdracht1 {
    public static void main(String[] args) {
        int[] primes = new int[100];
        int index = 0;

        for (int number = 2; number <= 100; number++){
            if (isPrime(number, primes)) {
                primes[index++] = number;
            }
        }
        System.out.println(Arrays.toString(primes));
    }

    private static boolean isPrime(int number, int[] primes){
        for (int divider : primes){ // /2 => meer efficient want grootste mogelijke deler is getal/2
            if (divider == 0 || divider > number/2) { // divider word 0 als geen getallen meer
                return true;
            }
            if (number % divider == 0){
                return false;
            }
        }
        return true;
    }
}
