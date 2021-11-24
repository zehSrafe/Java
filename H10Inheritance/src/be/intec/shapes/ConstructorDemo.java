package be.intec.shapes;

public class ConstructorDemo {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.getLength());

        Square square1 = new Square(420);
        System.out.println(square1.getLength());
    }
}
