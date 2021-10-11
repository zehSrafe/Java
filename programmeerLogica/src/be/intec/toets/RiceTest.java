package be.intec.toets;

import java.util.Scanner;

public class RiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weightkg1 = input.nextInt();
        double weightkg2 = input.nextInt();
        double price1 = input.nextInt();
        double price2 = input.nextInt();

        double priceKg1 = price1 / weightkg1;
        double priceKg2 = price2 / weightkg2;
        if (priceKg1 > priceKg2){
            System.out.println(price2);
        } else {
            System.out.println(price1);
        }
        input.close();
    }
}
