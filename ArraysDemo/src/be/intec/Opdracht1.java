package be.intec;

import java.sql.Array;
import java.util.Arrays;

public class Opdracht1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for(int i = 0; i < array.length; i++){
            array[i] = 7 * i;
        }
//        System.out.println(Arrays.toString(array));
        for (int number : array){
            System.out.println(number);
        }

        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }

        boolean[] boolArray = new boolean[]{true, false, true};
        for (boolean bool : boolArray){
            System.out.println(bool);
        }
    }
}
