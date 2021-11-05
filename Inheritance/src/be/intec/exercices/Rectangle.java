package be.intec.exercices;

public class Rectangle {
    private double width;
    private double length;
    private double x;
    private double y;

    private static int count = 0;

    {
        count++; // count is static so everytime new object is created it does ++
    }

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public Rectangle(double width, double length, double x, double y){
        setWidth(width);
        setLength(length);
        setX(x);
        setY(y);
    }

    public Rectangle(Rectangle r) {
        this(r.getWidth(), r.getLength(), r.getX(), r.getY());
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

    public void setPosition(int x, int y){
        setX(x);
        setY(y);
    }

    public String getPosition(){
        return "(" + getX() + ", " + getY() + ")";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
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

    public double getArea() {
        return this.length * this.width;
    }

    public double getCircumference() {
        return this.length * 2 + this.width * 2;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return String.format("Length: %.2f | Width: %.2f | Area: %.10f%n", getLength(), getWidth(), getArea());
//        return getWidth() + "x" + getLength() + " => " + getArea();
    }
}
