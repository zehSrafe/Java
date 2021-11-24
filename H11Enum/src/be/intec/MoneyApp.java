package be.intec;

public class MoneyApp {
    public static void main(String[] args) {
        Coin[] coins = Coin.values();
        System.out.println("Total value = " + calculateValue(coins) + " cents");
    }

    private static int calculateValue(Coin[] coins){
        int totalValue = 0;
        for (Coin c : coins){
            totalValue += c.getValue();
        }
        return totalValue;
    }
}
