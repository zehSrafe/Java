package be.intec;

public class Opdracht5 {
    public static void main(String[] args) {
        byte first = 5;
        byte second = 7;
        int sum = first * second;

        int aInt = 2147483645;
        int bInt = 2147483642;
        long result = (long) aInt * bInt;

        System.out.println(sum);
        System.out.println(result);
    }
}
