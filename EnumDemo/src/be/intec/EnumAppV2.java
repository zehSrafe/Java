package be.intec;

import java.util.Arrays;

public class EnumAppV2 {
    public static void main(String[] args) {
        Coin c1 = Coin.valueOf("TWO_EURO");
        Coin[] allCoins = Coin.values();
        System.out.println(Arrays.toString(allCoins));

        for (Coin coin : allCoins) {
            System.out.println(coin.name() + " - " + coin.ordinal());
        }

        System.out.println(Coin.FIVE_CENT.ordinal());
    }
}
