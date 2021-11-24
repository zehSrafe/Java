package be.intec.exercice2;

public class IsoScelesTriangle extends Triangle {
    private static int count = 0;

    {
        count++;
    }

    public IsoScelesTriangle(){
        this(1, 1);
    }

    public IsoScelesTriangle(int width, int height){
        this(width, height, 0, 0);
    }

    public IsoScelesTriangle(int width, int height, int x, int y){
        super(width, height, height, x, y); //guessing the perpendicular of this triangle is same as height
    }

    public IsoScelesTriangle(IsoScelesTriangle isoScelesTriangle){
        this(isoScelesTriangle.getWidth(), isoScelesTriangle.getHeight());
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return String.format("IsoSceles%s", super.toString());
    }
}
