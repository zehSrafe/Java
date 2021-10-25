package be.intec;

import java.util.Arrays;

public class SmallToBig {
    public static void main(String[] args) {
        int temp;
        int[] numberArray = {9, 3, 4, 37, 97};

        for (int i = 0; i < numberArray.length; i++){
            for (int j = 0; j < numberArray.length; j++){
                if (numberArray[j] < numberArray[i]){
                    temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numberArray));
    }
}
