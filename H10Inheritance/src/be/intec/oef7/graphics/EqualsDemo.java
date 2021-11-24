package be.intec.oef7.graphics;

import be.intec.shapes.Rectangle;
import be.intec.shapes.Square;

public class EqualsDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(10, 15);
        Square s1 = new Square(10);
        Square s2 = new Square(15);

        Rectangle r3 = new Rectangle(10, 11);
        Rectangle r4 = new Rectangle();
        Square s3 = new Square(9);
        Square s4 = new Square();

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r1.equals(r4));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(r2));
    }
}
