package be.intec.graphics;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle test = new Circle(6);

        System.out.println(circle.getCircumference() + "  " + circle.getArea());
        System.out.println(test.getCircumference() + "  " + test.getArea());
    }
}
