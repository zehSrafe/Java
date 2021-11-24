package be.intec.oef7.graphics;

public class Triangle extends Shape{
    private int width;
    private int height;
    private int perpendicular;

    public final int ANGLES = 3;
    private static int count = 0;

    {
        count++;
    }

    public Triangle(){
        this(1, 1, 1);
    }

    public Triangle(int width, int height, int perpendicular){
        this(width, height, perpendicular, 0, 0);
    }

    public Triangle(int width, int height, int perpendicular, int x, int y){
        super(x, y);
        setWidth(width);
        setHeight(height);
        setPerpendicular(perpendicular);
    }

    public Triangle(Triangle triangle){
        this(triangle.getWidth(), triangle.getHeight(), triangle.getPerpendicular(), triangle.getX(), triangle.getY());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    public double getArea() {
        return (double) this.perpendicular * this.width / 2;
    }

    public double getPerimeter() {
        return this.height * 2 + this.width;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return String.format("Triangle: %dx%d, perpendicular: %d at position %s", getWidth(), getHeight(), getPerpendicular(), super.toString());
    }
}
