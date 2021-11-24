package be.intec;

public class Transacties {

    public static double berekenFee(double a){
        return a * 0.13;
    }

    public static void main(String[] args) {
        double bedrag = 5.1;
        double total = bedrag;

        if (bedrag > 5){
            total += berekenFee(bedrag);
        }
        System.out.println(total);
    }
}
