package be.intec;

import java.util.Scanner;

public class methodes {

    public static int sum(int a, int b){
        return a + b;
    }

    public static int substract(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        int res;
        boolean optellen;
        Scanner input = new Scanner(System.in);
        System.out.println("Geef waarde voor a");
        int a = input.nextInt();
        System.out.println("Geef waarde voor b");
        int b = input.nextInt();
        input.nextLine();
        System.out.println("Optellen (true) of aftrekken (false)?");
        optellen = input.nextBoolean();
        input.close();

        if (optellen){
            res = sum(a, b);
        } else {
            res = substract(a, b);
        }
        System.out.println(res);
    }
}
