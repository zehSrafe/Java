package be.intec.toets;

import java.util.Scanner;

public class DevididableTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean result1 = false;
        boolean result2 = false;
        if (number % 5 == 0 && number % 6 == 0){
            result1 = true;
        }
        if (number % 5 == 0 || number % 6 == 0){
            result2 = true;
        }
        System.out.println(result1);
        System.out.println(result2);
        input.close();
    }
}
