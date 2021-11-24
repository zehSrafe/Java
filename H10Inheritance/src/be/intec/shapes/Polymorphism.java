package be.intec.shapes;

public class Polymorphism {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectSquare = new Square();

        rectSquare.setWidth(50); // kan enkel methodes van superklasse aanroepen. is van type square dus zal wel die gebruiken van square indien deze bestaat
        System.out.println(rectSquare.toString());
    }
}
