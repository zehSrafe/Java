package be.intec;

import java.util.Scanner;

public class vb {
    public static void main(String[] args) {
//        CoinV2 one_Cent = CoinV2.ONE_CENT;
//        CoinV2 twoCent = CoinV2.TWO_CENT;
//        System.out.println(one_Cent.ordinal());
//        System.out.println(twoCent.ordinal());
//        System.out.println(one_Cent);
//        System.out.println(twoCent.name());
//        System.out.println(twoCent.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats the total amount you need to pay?");
        double totAmount = scanner.nextDouble();
        scanner.nextLine();
        calculateAmountOfCoins(totAmount);
        scanner.close();
    }

    private static void calculateAmountOfCoins(double totAmount) {
        CoinV2[] coins = CoinV2.values();
        double[] bestCoin = new double[coins.length];

        for (int i = coins.length - 1; i >= 0; i--) {
            if (totAmount - coins[i].getValue() > 0) {
                double rest = totAmount % coins[i].getValue();
                double min = totAmount - rest;
                double result = min / coins[i].getValue();
                totAmount -= min;
                bestCoin[i] = result;
            } else {
                bestCoin[i] = 0;
            }
        }

        for (int i = 0; i < coins.length; i++){
            System.out.println(coins[i].toString() + ": " + bestCoin[i]);
        }
    }
}
