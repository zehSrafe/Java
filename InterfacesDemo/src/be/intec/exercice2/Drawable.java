package be.intec.exercice2;

public interface Drawable extends Scalable{
    Drawable[] drawables = new Drawable[999];

    void draw(DrawingContext dc);
}
