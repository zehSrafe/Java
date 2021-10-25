package be.intec;

import java.util.Arrays;
import java.util.Scanner;

public class Opdracht4 {
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 2, 5, 1, 6, 4, 8, 10, 5, 12, 3, 6, 8, 9, 7, 4, 1, 420, 5, 8, 9, 4, 1, 4};
        int total = 0;
        Scanner input = new Scanner(System.in);
        String text;

        System.out.println("Input text");
        text = input.nextLine();
        input.close();

        char[] carachters = text.toCharArray();
        for (char carachterValue : carachters){
            total += score[(int) carachterValue - 97]; // convert to asci, -97 to get coressponding value from score array
        }
        System.out.println(total);
    }
}
