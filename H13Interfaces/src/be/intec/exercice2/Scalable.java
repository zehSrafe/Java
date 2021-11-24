package be.intec.exercice2;

public interface Scalable {
    int QUARTER = 25;
    int HALF = 50;
    int DOUBLE = 200;

    public abstract void scale(int factor);

    public default void scaleDouble(){
        scale(DOUBLE);
    }

    public default void scaleHalf(){
        scale(HALF);
    }
}
