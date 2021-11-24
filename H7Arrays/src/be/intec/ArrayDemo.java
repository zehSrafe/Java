package be.intec;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {

        // [0, 0, 0, 0, 0]
        int[] myArray = new int[6];
        myArray[1] = 50;
        // [0, 50, 0, 0, 0]


        for (int myNumber : myArray) {
            System.out.println(myNumber);
        }

        for (int i = 0; i < myArray.length ; i++) {
            Random random = new Random();
             myArray[i] = random.nextInt(45) + 1;
        }

         System.out.println(   "[43, 12, 8, 40, 16, 33]\n" + Arrays.toString(myArray)  );
    }
}
