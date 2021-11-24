package be.intec.exercice2;

public class IteratingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Rectangle r = new Rectangle(50,50, 50, 50);
        Rectangle r2 = new Rectangle(51,50, 50, 50);
        Rectangle r3 = new Rectangle(52,50, 50, 50);
        Rectangle r4 = new Rectangle(53,50, 50, 50);
        Rectangle r5 = new Rectangle(54,50, 50, 50);
        Rectangle r6 = new Rectangle(55,50, 50, 50);
        Rectangle r7 = new Rectangle(56,50, 50, 50);
        Rectangle r8 = new Rectangle(57,50, 50, 50);
        Rectangle r9 = new Rectangle(58,50, 50, 50);

        drawing.add(r, r2, r3, r4, r5, r6, r7, r8, r9);

        for (Drawable drawable : drawing){
            drawable.draw(new TextDrawingContext());
        }
    }
}
