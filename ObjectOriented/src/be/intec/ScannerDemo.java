package be.intec;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey, number?");
        int userNumber = input.nextInt();
        System.out.println("Number");
        int number = input.nextInt();

        int sum = userNumber + number;
        System.out.println(sum);
        input.close();
    }
}
