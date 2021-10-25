package be.intec;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;

        System.out.println("Input text");
        text = input.nextLine();
        input.close();

        System.out.println(Arrays.toString(text.split(" ")));
    }

}
