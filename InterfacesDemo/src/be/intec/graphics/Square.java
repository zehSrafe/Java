package be.intec.graphics;

public class Square extends Rectangle{
    private static int count = 0;

    {
        count++;
    }

    public Square(){
        this(1);
    }

    public Square(int side){
        this(side, 0, 0);
    }

    public Square(int side, int x, int y){
        super(side, side, x, y);
    }

    public Square(Square square){
        this(square.getSide(), square.getX(), square.getY());
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    public void setSide(int side){
        setLength(side);
        setWidth(side);
    }

    public int getSide(){
        return super.getWidth();
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return String.format("Square: %s", super.toString());
    }
}
