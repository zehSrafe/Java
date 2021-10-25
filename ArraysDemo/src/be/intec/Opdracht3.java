package be.intec;

import java.util.Arrays;

public class Opdracht3 {
    public static void main(String[] args) {
        int[][] myArray = new int[4][6];

        for (int column = 0; column < myArray.length; column++){
            for (int row = 0; row < myArray[column].length; row++){
                myArray[column][row] = (column + 1) * (row + 1);
            }
        }

        for (int i = 0; i < 4; i++){
            System.out.println((Arrays.toString(myArray[i])));
        }
    }
}
