package be.intec.exercices;

public class Square extends Rectangle{
    private static int count = 0;

    {
        count++;
    }

    public Square(){
        this(1);
    }

    public Square(double size){
        this(size, size, 0, 0);
    }

    public Square(Square square){
        super(square);
    }


    public Square(double length, double width, int x, int y){
        super(width, length, x, y);
    }

    public void setSize(double size){
        super.setWidth(size);
        super.setLength(size);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return String.format("%.2fx%.2f%n%.2f - %.2f at position %s", super.getWidth(), super.getLength(), super.getArea(), super.getCircumference(), super.getPosition());
    }
}
