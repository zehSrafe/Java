package be.intec.ifElse;

import java.util.Scanner;

public class opdracht2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Give number");
            number = input.nextInt();
            if (number > 0){
                System.out.println("Positive");
            } else if (number < 0){
                System.out.println("Negative");
            } else {
                System.out.println("ZERO");
            }
        } while (number != 0);
        input.close();
    }
}
