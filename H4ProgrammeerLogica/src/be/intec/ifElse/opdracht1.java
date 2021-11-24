package be.intec.ifElse;

import java.util.Scanner;

public class opdracht1 {
    public static int check(int number, int biggest){
        if (number > biggest){
            biggest = number;
        }
        return biggest;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef waarde in voor getal 1");
        int biggest = input.nextInt();
        System.out.println("Geef waarde in voor getal 2");
        int number = input.nextInt();
        biggest = check(number, biggest);
        System.out.println("Geef waarde in voor getal 3");
        number = input.nextInt();
        biggest = check(number, biggest);
        System.out.println(biggest);
        input.close();

    }
}
