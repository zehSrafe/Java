package be.intec.exercice2;

import java.util.Objects;

public class Rectangle extends Shape {
    private int width;
    private int length;

    public final int ANGLES = 4;
    private static int count = 0;

    {
        count++;
    }

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int width, int length) {
        this(width, length, 0, 0);
    }

    public Rectangle(int width, int length, int x, int y){
        super(x, y);
        setWidth(width);
        setLength(length);
    }

    public Rectangle(Rectangle r) {
        this(r.getWidth(), r.getLength(), r.getX(), r.getY());
    }


    public void setWidth(int width) {
        if (width < 0){
            this.width = -width;
        } else {
            this.width = width;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        if (length < 0){
            this.length = -length;
        } else {
            this.length = length;
        }
    }

    public int getLength() {
        return length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return this.length * 2 + this.width;
    }

    public void grow(int factor){
        setLength(length * factor);
        setWidth(width * factor);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return String.format("Rectangle: %dx%d at position %s", getWidth(), getLength(), super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && length == rectangle.length && ANGLES == rectangle.ANGLES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, length, ANGLES);
    }

    @Override
    public void scale(int factor) {
        setLength(getLength() * factor / 100);
        setWidth(getWidth() * factor / 100);
    }

    public void draw(DrawingContext dc){
        dc.draw(this);  // verwijst naar de methode uit de interface DrawingContext
    }
}
