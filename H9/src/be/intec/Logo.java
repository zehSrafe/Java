package be.intec;

import java.util.Arrays;

public class Logo {
    private Rectangle[] rectangles;
    private Circle[] circles;
    private String text;

    public Logo(Rectangle[] rectangle, Circle[] circle, String text) {
        setRectangles(rectangle);
        setCircles(circle);
        setText(text);
    }

    public Rectangle[] getRectangles() {
        return rectangles;
    }

    public void setRectangles(Rectangle[] rectangles) {
        this.rectangles = rectangles;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getArea(){
        double totalArea = 0;
        for (Rectangle rectangle : rectangles) {
            totalArea += rectangle.getArea();
        }
        for (Circle circle : circles){
            totalArea += circle.getArea();
        }

        return totalArea;
    }

    @Override
    public String toString() {
        return String.format("LOGO: %n%s%nRECTANGLE: %n%s%nCIRCLE: %n%s", getText(), Arrays.toString(rectangles), Arrays.toString(circles));
/*        return "Logo{" + "\n" +
                "rectangle= " + rectangle.toString() + "\n" +
                "circle= " + circle + "\n" +
                "text= '" + text + '\'' + "\n" +
                '}';*/
    }
}
