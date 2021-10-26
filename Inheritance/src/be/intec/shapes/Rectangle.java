package be.intec.shapes;

public class Rectangle {
    public final String DESCRIPTION = "Rectangle";
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public Rectangle() {
        this(1, 1);
    }

    public void setWidth(double width) {
        if (width < 0){
            this.width = -width;
        } else {
            this.width = width;
        }
    }

    public void setLength(double length) {
        if (length < 0){
            this.length = -length;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getCircumference() {
        return this.length * 2 + this.width * 2;
    }

    @Override
    public String toString(){
        return String.format("Length: %.2f | Width: %.2f | Area: %.10f%n", getLength(), getWidth(), getArea());
//        return getWidth() + "x" + getLength() + " => " + getArea();
    }
}
