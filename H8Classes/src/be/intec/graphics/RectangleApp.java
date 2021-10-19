package be.intec.graphics;

import static be.intec.graphics.Rectangle.getCount;
//import static be.intec.graphics.Rectangle.*;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(4);
        rect.setWidth(4);
        rect.setX(-2);
        rect.setY(9);
        System.out.println("Rect: " + rect.getLength() + "x" + rect.getWidth() + " at (" + rect.getX() + "," + rect.getY() + "). Area: " + rect.getArea() + " Circumference: " + rect.getCircumference() + " Corners: " + Rectangle.ANGLES);

//        Rectangle rect = new Rectangle(5, 6, -8, -9);

        Rectangle rectangle = new Rectangle(rect.getWidth(), rect.getLength(), rect.getX(), rect.getY());
        System.out.println("Rectangle: " + rectangle.getLength() + "x" + rectangle.getWidth() + " at (" + rectangle.getX() + "," + rectangle.getY() + "). Area: " + rectangle.getArea() + " Circumference: " + rectangle.getCircumference() + " Corners: " + Rectangle.ANGLES);
        Rectangle testRect = new Rectangle(rect);
        System.out.println("Test: " + testRect.getLength() + "x" + testRect.getWidth() + " at (" + testRect.getX() + "," + testRect.getY() + "). Area: " + testRect.getArea() + " Circumference: " + testRect.getCircumference() + " Corners: " + Rectangle.ANGLES);


        rect.grow(2);
        System.out.println("Rect: " + rect.getLength() + "x" + rect.getWidth() + " at (" + rect.getX() + "," + rect.getY() + "). Area: " + rect.getArea() + " Circumference: " + rect.getCircumference() + " Corners: " + Rectangle.ANGLES);
        System.out.println(getCount());
    }
}
