package be.intec;

import java.util.Scanner;

public class opdracht8 {
    public static String chechLeapYear(double number){
        if (number % 400 == 0 || (number % 4 == 0 && number % 100 != 0)){
            return "Leap year";
        } else {
            return "Not this time";
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give number");
        System.out.println(chechLeapYear(input.nextDouble()));
        input.close();
    }
}
