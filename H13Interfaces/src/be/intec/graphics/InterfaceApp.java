package be.intec.graphics;

public class InterfaceApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        Shape rectangle1 = new Rectangle(10, 15);
        Scalable rect = new Rectangle(10, 15);

        System.out.println(rectangle);
        rectangle.scale(Scalable.DOUBLE);
        System.out.println(rectangle);
        rectangle.scaleDouble();            // maakt gebruik van de scaleDouble constructor met default keywoord
        System.out.println(rectangle);
        Scalable.helloWord();
    }
}
