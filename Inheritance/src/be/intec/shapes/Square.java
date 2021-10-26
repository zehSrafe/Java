package be.intec.shapes;

public class Square extends Rectangle {
    public final String DESCRIPTION = "Square";

    @Override
    public void setLength(double length){
        reseize(length);
    }

    @Override
    public void setWidth(double width){
        reseize(width);
    }

    public void reseize(double side){
        super.setLength(side);
        super.setWidth(side);
    }
}
