package be.intec.shapes;

import be.intec.exercices.Rectangle;

public class GeometryApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(15);

        Square square = new Square();
        square.reseize(420);

        System.out.println(rectangle.toString());
        System.out.println(square.toString());
//        System.out.println(rectangle.getLength() + " x " + rectangle.getWidth());
//        System.out.println(square.getLength() + " x " + square.getWidth());
    }
}
