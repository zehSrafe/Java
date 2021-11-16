package be.intec;

public class ConcertApp {
    public static void main(String[] args) {
        Musician jaques = new Musician();
        jaques.play();

//        Musician.Instrument instrument = new Musician.Instrument(); // werkt als nested klasse statisch is
//        Musician.Instrument instrument1 = jaques.new Instrument();  //=> werkt als de methode nested klasse niet statisch is
    }
}
