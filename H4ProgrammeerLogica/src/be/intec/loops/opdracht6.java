package be.intec.loops;

import java.util.Scanner;

public class opdracht6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Give 2 numbers");
            int number = input.nextInt();
            System.out.println(number + input.nextInt());
            System.out.println("Try again? (1/0)");
            choice = input.nextInt();
        } while (choice != 0);
        input.close();
    }
}
