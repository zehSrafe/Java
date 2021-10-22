package be.intec;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int randNumber = random.nextInt();
        System.out.println(randNumber);
        System.out.println(Math.abs(randNumber % 42) + 1); //van 1 tot 41 (+1 to rule out 0)
        int limNumber = random.nextInt(42); // van 0 tot 41 () if +1 then 1 - 42
    }
}
