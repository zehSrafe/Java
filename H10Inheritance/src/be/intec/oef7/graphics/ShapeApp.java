package be.intec.oef7.graphics;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5, 48, 9);
        Circle circle = new Circle(9, 2, 3);
        Triangle triangle = new Triangle(55, 3, 44, 420, 69);
        Square square = new Square(88, 4, 1);
        IsoScelesTriangle isoScelesTriangle = new IsoScelesTriangle(93, 12, 7, 21);

        System.out.println("Rectangle: " + rectangle.toString());
        System.out.println(circle.toString());
        System.out.println(triangle.toString());
        System.out.println(square.toString());
        System.out.println(isoScelesTriangle.toString());
    }
}
