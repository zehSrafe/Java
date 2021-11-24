package be.intec.graphics;

import java.util.Objects;

public abstract class Shape implements Scalable{
    private int x;
    private int y;

    private static int count = 0;

    {
        count++;
    }

    public Shape(){
        this(0, 0);
    }

    public Shape(int x, int y){
        setPosition(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y){
        setX(x);
        setY(y);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public static int getCount() {
        return count;
    }

    public String toString(){
        return String.format("(%d, %d)", getX(), getY());
    }

//    @Override                 ==> hoe een equals methode schrijven
//    public boolean equals(Object o) {
//        if (o == null){
//            return false;
//        }
//        if (o instanceof Shape){
//            Shape shapeToCompare = (Shape) o;
//            if (getX() == shapeToCompare.getX() && getY() == shapeToCompare.getY()){
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
