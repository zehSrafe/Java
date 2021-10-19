package be.intec;

public class RectangleAppDemo {
    public static void main(String[] args) {
        RectangleDemo rectangleDemo = new RectangleDemo();
        rectangleDemo.setLength(-5);
        rectangleDemo.setWidth(4);

        RectangleDemo square = new RectangleDemo();
        square.setLength(4);
        square.setWidth(4);

        System.out.println("Rectangle: " + rectangleDemo.getLength() + " " + rectangleDemo.getWidth() + " " + rectangleDemo.getArea() + " " + rectangleDemo.getCircumference());
        System.out.println("Square: " + square.getLength() + " " + square.getWidth() + " " + square.getArea() + " " + square.getCircumference());
    }
}
