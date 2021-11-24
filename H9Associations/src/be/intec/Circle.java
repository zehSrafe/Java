package be.intec;

public class Circle {
    public double getArea(){
        return 10;
    }

    public int getIntCircle(){
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Length: %s | TestInt: %d%n", "Working circle", getIntCircle());
//        return "Working circle";
    }
}
