package be.intec;

public class AppV2 {
    public static void main(String[] args) {
        CoinV2 oneCent = CoinV2.ONE_CENT;
        CoinV2 twoCent = CoinV2.TWO_CENT;

        System.out.println(oneCent.getValue());
        System.out.println(oneCent.name());
        System.out.println(twoCent.ordinal());
        System.out.println(twoCent);

        CoinV2 vb = CoinV2.valueOf("FIFTY_CENT");
        System.out.println(vb);


        double total = 0;

        CoinV2[] coins = CoinV2.values();
        for (CoinV2 c : coins){
            total += c.getValue();
            System.out.println(total);
        }
    }
}
