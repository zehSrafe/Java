package be.intec.exercices;

public class Square extends Rectangle{
    public void setSize(double size){
        super.setWidth(size);
        super.setLength(size);
    }

    @Override
    public String toString(){
        return String.format("%.2fx%.2f%n%.2f - %.2f", super.getWidth(), super.getLength(), super.getArea(), super.getCircumference());
    }
}
