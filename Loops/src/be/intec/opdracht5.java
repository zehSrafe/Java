package be.intec;

import java.util.Scanner;

public class opdracht5 {
    public static void main(String[] args) {
        System.out.println("Give number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        for (int i = 1; i != 11; i++){
            System.out.println(i * number);
        }
    }
}
