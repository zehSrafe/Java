package be.intec.ifElse;

import java.util.Scanner;

public class opdracht7 {
    public static double calculateAvrg(double number, double number1, double number2){
        return (number + number1 + number2) / 3;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give number");
        double number = input.nextDouble();
        System.out.println("Give number");
        double number1 = input.nextDouble();
        System.out.println("Give number");
        System.out.println(calculateAvrg(number, number1, input.nextDouble()));
        input.close();
    }
}
