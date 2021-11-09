package be.intec.exercice2;

import java.util.Arrays;
import java.util.Objects;

public class Drawing implements Drawable{
    private Drawable[] drawables;
    private int size;

    public Drawing() {
        drawables = new Drawable[100];
        size = 0;
    }

    public void add(Drawable drawable) {
        int index = findElementIndex(null);
        if (findElementIndex(drawable) != -1) {         // array is nog niet vol
            return;
        }

        if (index == -1) {                              // array is vol
//            Drawable[] biggerShapeArray = new Drawable[drawables.length+1];     // maak een nieuwe array die 1 plaats groter is
//            System.arraycopy(drawables, 0, biggerShapeArray, 0, drawables.length);  // koppieer volledige oude array van positie 0 (tot einde) en plaats in nieuwe array vanaf plaats 0
//            drawables = biggerShapeArray;           // plaats nieuwe array in oude array. maakt basically u array groter
//            index = drawables.length-1;         // weten nu dat laatste plaats de enige plaats met null waarde is dus index naar daar verplaatsen

            // kortere versie
            drawables = Arrays.copyOf(drawables, drawables.length + 1); // koppieert oude array in een nieuwe array met een legte +1
            index = drawables.length - 1;       // same as above above
        }

        drawables[index] = drawable;
        size++;
    }

    public void remove(Drawable drawable) {
        int index = findElementIndex(drawable);
        if (index == -1) {      // geen element gevonden die overeenkwam met meegegeven object
            return;             // zorgt ervoor dat de methode gestopt word
        }

        drawables[index] = null;
        size--;
    }

    private int findElementIndex(Drawable drawable) {
        for (int i = 0; i < drawables.length; i++) {
            // without Object.equals() =>  if (drawables[i] == drawable || (drawables[i] != null && drawables[i].equals(drawable))
            if (Objects.equals(drawables[i], drawable)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        Arrays.fill(drawables, null);
    }

    public int getSize() {
        return size;
    }

    @Override
    public void draw(DrawingContext dc) {
        for (Drawable drawable : drawables){
            if (drawable != null){
                drawable.draw(dc);
            }
        }
    }

    @Override
    public void scale(int factor) {
        for (Drawable drawable : drawables){
            if (drawable != null) {
                drawable.scale(factor);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder strToReturn = new StringBuilder();
        for (Drawable drawable : drawables){
            if (drawable != null){
                strToReturn.append(drawable.toString()).append("\n");
            }
        }
        return strToReturn.toString();
    }
}
