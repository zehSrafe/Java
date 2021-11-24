package be.intec.toets;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int rest;
        int result = 0;
        while (number < 0 || number > 1000){
            number = input.nextInt();
        }
        do {
            rest = number % 10;
            result += rest;
            number /= 10;
        } while (number != 0);
        System.out.println(result);
        input.close();
    }
}
