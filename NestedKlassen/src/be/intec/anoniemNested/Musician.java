package be.intec.anoniemNested;

public class Musician {
    public void play(){
        Instrument piano = new Instrument() {  //  is eingenlijk een klasse tot de sluittag
                                                    // is een anonieme klasse die de interface Instrument implementeerd
            @Override
            public void makeSound(String sound) {
                System.out.println("Piano says " + sound);
            }
        };

        Instrument guitar = new Instrument() {  //  is eingenlijk een klasse tot de sluittag
            // is een anonieme klasse die de interface Instrument implementeerd
            @Override
            public void makeSound(String sound) {
                System.out.println("Guitar says " + sound);
            }
        };

        // word angeroepen bij de methode Musician.play(). (dit script is allemaal maar een methode)
        piano.makeSound("bim");
        guitar.makeSound("grrr");
    }
}
