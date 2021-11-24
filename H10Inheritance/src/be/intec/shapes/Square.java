package be.intec.shapes;

public class Square extends Rectangle {
    public final String DESCRIPTION = "Square";

    public Square() {
        super(); // zal de default waarden nemen van de superklasse. in dit geval 1 voor lengte en breedte
    }

    public Square(double size) {
        super(size, size);
    }

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
