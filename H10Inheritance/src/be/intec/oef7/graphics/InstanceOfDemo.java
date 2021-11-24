package be.intec.oef7.graphics;

import be.intec.shapes.Rectangle;
import be.intec.shapes.Square;

public class InstanceOfDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Square();
        Square sq = new Square();

//        Square s3 = r1;    => doesn't work bcs referensite is Rectangle (super of square)
//        Square s3 = r2;    => doesn't work bcs referensite is Rectangle (super of square)
//        Square s3 = sq;    => works bcs is a square

        System.out.println(r1 instanceof Rectangle);
        System.out.println(r2 instanceof Rectangle);
        System.out.println(sq instanceof Rectangle);

        System.out.println(r1 instanceof Square);
        System.out.println(r2 instanceof Square);
        System.out.println(sq instanceof Square);
    }
}
