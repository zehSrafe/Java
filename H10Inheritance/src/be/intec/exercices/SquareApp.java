package be.intec.exercices;

public class SquareApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle r1 = new Rectangle();

        Square square = new Square();

        square.setSize(420);
        square.setPosition(4, 5);

        System.out.println(square.toString());

        System.out.println(Rectangle.getCount()); // square uses Rectangle aswell so 3 rectangles
        System.out.println(Square.getCount()); // square only is used once so 1
    }
}
