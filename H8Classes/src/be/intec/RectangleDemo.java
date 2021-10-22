package be.intec;

public class RectangleDemo {
    private double width;
    private double length;

    public RectangleDemo(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public RectangleDemo() {
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
}
