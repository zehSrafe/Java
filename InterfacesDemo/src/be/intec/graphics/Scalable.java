package be.intec.graphics;

public interface Scalable {
    public static final int QUARTER = 25; // verplicht public static final in a interface
    public static final int HALF = 50;
    int DOUBLE = 200;   //public static final is niet nodig aangezien in interface

    public abstract void scale(int factor); // methodes MOETEN public en MOETEN abstract in interface

    public default void scaleDouble(){      // default keyword zorgt ervoor dat "normale" methode schrijven mogelijk is
        scale(DOUBLE);
    }

    public default void scaleHalf(){      // zorgt ervoor dat je rectangle.scaleDouble(); kan schrijven i.p.v. rectangle.scale(Scalable.DOUBLE);
        scale(HALF);
    }

    public default void scaleQuarter(){
        scale(QUARTER);
    }

    public static void helloWord(){
        System.out.println("Hello world!");
    }
}
