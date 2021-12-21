package be.intec;

import java.util.Objects;

public class Box implements Comparable<Box>{
    private int heigth;
    private int width;
    private int length;

    public Box(){
        this(1, 2, 3);
    }

    public Box(int heigth, int width, int length) {
        this.heigth = heigth;
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return width == box.width && length == box.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    @Override
    public String toString() {
        return "Box{" +
                "heigth=" + heigth +
                ", width=" + width +
                ", length=" + length +
                ", volume=" + heigth * width * length +
                '}';
    }

    @Override
    public int compareTo(Box o) {
        int volume = length * width * heigth;
        int volumeBoxO = o.heigth * o.width * o.length;

        return volume - volumeBoxO; // returns difference between box you call method on and box you give as argument
        // automatically sorts from smallest to greatest. switsch volume and volumeBoxO from place from sorting greatest to smallest.
    }
}
