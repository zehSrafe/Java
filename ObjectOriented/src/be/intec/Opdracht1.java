package be.intec;

import java.util.Random;

public class Opdracht1 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 3; i++){
            System.out.println(random.nextInt());
        }
        System.out.println(random.nextInt(10)); // 0 - 9
        System.out.println(random.nextInt(5) + 5); // 5 - 9
        System.out.println(random.nextInt(10) - 5); // -5 - 4


        for (int i = 0; i < 5; i++){
            System.out.printf(random.nextInt(46) + " - ");
        }
        System.out.println("" + random.nextInt(46));
    }
}
