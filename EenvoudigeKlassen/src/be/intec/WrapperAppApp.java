package be.intec;

public class WrapperAppApp {
    public static void main(String[] args) {
        int myInt = 88;
        Integer myInteger = Integer.valueOf(myInt);

        System.out.println("Integer: " + myInteger);
        System.out.println("Bit: " + Integer.bitCount(myInteger));
        System.out.println("Byte: " + myInteger.byteValue());
    }
}
