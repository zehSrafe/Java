package be.intec;

public class WrapperApp {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(69, 420));

        int a = 4;
        int b = 8;
        int c = 3;
        int d = 9;
        System.out.println(Integer.max(Integer.max(a, b), Integer.max(c, d))); // zal grootste van 4 getallen teruggeven

        Integer myInt = 420;        // is hetzelfde als      Integer myInt = new Integer(420);
        Double myDouble = 45.33;
        long thisLong = a;
//        Long myLong = a;      => niet mogelijk met objecten ding. zie H12
        Long myLong = (long) a;
        Long veryLong = 35L;

        int smallInt = 10;
        Integer objInt = 6;
        incrementInt(smallInt);
        incrementInt(objInt);   // werkt ook omdat Java haalt de waarde uit de int
        System.out.println(smallInt);
        System.out.println(objInt);
        incrementInteger(smallInt);
        incrementInteger(objInt);
        System.out.println(smallInt);
        System.out.println(objInt);

        Integer i1 = 4000;
        Integer i2 = 4000;
        int i3 = 4000;
        int i4 = 4000;
        System.out.println(i1 == i2);       // zijn objecten die elk verwijzen naar een ander adres dus false.
                                            // als dat getal in 8 bits past (t.e.m. -128/127 want eerste bit toont positief of negatief)
                                            // word dit anders opgeslagen en kan je het wel vergelijken
        System.out.println(i1.equals(i2));  //equals gaat de velue van de objecten eruit halen en vergijlijken
        System.out.println(i3 == i4);

        String s = new String("hello");
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = "hello";
        System.out.println(s == s1); // je maakt expliciet een nieuw object aan dus same as above.
        System.out.println(s2 == s3); // maakt geen expliciet object aan dus voila

        System.out.printf("My age is %d", 24);
    }

    private static void incrementInt(int num){
        num++;
    }

    private static void incrementInteger(Integer integer){
        integer++;
    }
}
