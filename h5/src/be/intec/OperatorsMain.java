package be.intec;

public class OperatorsMain {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a++); // gebruik en verhoog
        System.out.println(++a); // verhoog en dan gebruik
        a++;
        System.out.println(a);

        System.out.println(-a); // makes negative
        System.out.println(+a);

        int b = 10;
        boolean test = false;
        if (b >= 5 & b <= 15){ // checkt beide condities ookal is de eerste fout
            System.out.println("In between 5 and 15");
        }
        if (b >= 5 && b <= 15){ // checkt condietie per condiete en stop zodra een fout is
            System.out.println("In between 5 and 15");
        }
        if (b >= 5 & (test = b <= 15)){ // ken resultaat van b <= 15 toe aan test + bewijst dat beide condities worden gechecked
            System.out.println("In between 5 and 15");
        }
        if (b >= 5 && (test = b <= 15)){ // bewijst dat tweede conditie niet meer gechecked word
            System.out.println("In between 5 and 15");
        }
        // => same for the || (or) operator

        if (!(b >= 5)){ // makes condition false
            System.out.println("In between 5 and 15");
        }

        int e = 10;
        int f = e > 5 ? 1 : 0; // same as javascript. basicall if-else

        short n = 2;

    }
}
