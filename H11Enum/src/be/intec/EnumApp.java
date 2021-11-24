package be.intec;

import java.util.Scanner;

public class EnumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much do you need to pay?");
        int amountToPay = scanner.nextInt();

        processPayment(amountToPay);
    }

    private static void processPayment(int amount) {
        Coin[] coins = {Coin.TWO_EURO, Coin.ONE_EURO, Coin.FIFTY_CENT, Coin.TWENTY_CENT, Coin.TEN_CENT, Coin.FIVE_CENT, Coin.TWO_CENT, Coin.ONE_CENT};
        int[] amountCoin = new int[8];

        for (int i = 0; i < coins.length; i++){
            amountCoin[i] = getAmountOfACertainCoin(amount, coins[i]);
            amount -= coins[i].getValue() * amountCoin[i];
            printCoins(amountCoin[i], coins[i]);
        }
    }

    private static int getAmountOfACertainCoin(int amount, Coin coin) {
        int amountOfCoin = 0;
        while (amount >= coin.getValue()) {
            amountOfCoin++;
            amount -= coin.getValue();
        }
        return amountOfCoin;
    }

    private static void printCoins(int amount, Coin coin) {
        if (amount != 0) {
            System.out.println(coin + ": " + amount);
        }
    }
}
