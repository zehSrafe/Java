package be.intec.graphics;

public class Rectangle {
    private double width;
    private double length;
    private double x;
    private double y;
    private static int count = 0;
    public static final int ANGLES = 4;

    {
        count++;
    }

//    public Rectangle(Rectangle rectangleObject){
//        this(rectangleObject);
//    }

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double length) {
        this(width, length, 0, 0);
    }

    public Rectangle(Rectangle r) {
        this(r.getWidth(), r.getLength(), r.getX(), r.getY());
    }

    public Rectangle(double width, double length, double x, double y){
        setWidth(width);
        setLength(length);
        setX(x);
        setY(y);
    }

    public void grow(double factor){
        if (factor < 0){
            setWidth(getWidth() + (-factor));
            setLength(getLength() + (-factor));
        } else {
            setWidth(getWidth() + factor);
            setLength(getLength() + factor);
        }
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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getCircumference() {
        return this.length * 2 + this.width * 2;
    }

    public static int getCount() {
        return count;
    }
}
