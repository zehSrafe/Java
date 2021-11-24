package be.intec.toets;

import java.util.Scanner;

public class CilinderCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextInt();
        double length = input.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println(area);
        System.out.println(volume);
        input.close();
    }
}
