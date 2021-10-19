package be.intec.graphics;

public class Circle {
    private double radius;

    public Circle(){
        this(2);
    }

    public Circle(double radius){
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        return this.radius * Math.PI * 2;
    }

    public double getArea(){
        return Math.PI * Math.pow(2, this.radius);
    }
}
