package be.intec.oef7.graphics;

public class Circle extends Shape{
    private int radius;

    public final int ANGLES = 0;
    private static int count = 0;

    {
        count++;
    }

    public Circle(){
        this(1);
    }

    public Circle(int radius){
        this(radius, 0, 0);
    }

    public Circle(int radius, int x, int y){
        super(x, y);
        setRadius(radius);
    }

    public Circle(Circle circle){
        this(circle.getRadius(), circle.getX(), circle.getY());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (Circle.this.radius < 0){
            this.radius = -radius;
        } else {
            this.radius = radius;
        }
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void grow(int factor){
        setRadius(getRadius() * factor);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return String.format("Circle: radius %d at position %s", getRadius(), super.toString());
    }
}
