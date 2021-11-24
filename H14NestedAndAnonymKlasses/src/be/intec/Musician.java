package be.intec;

public class Musician {
    private String nameMusician = "Roger Roger";

    public void play(){
        int a = 5;

        class Instrument { // private dan kan enkel Musician dit gaan gebruiken
            private String name = "Bob";

            public void makeSound(){
                System.out.println(nameMusician + " plays and instrument");
                System.out.println(a); // word niet meer aangepast. dus constant beschouwd. dus kan aan de variable
            }
        }
//        a = 7; // this line breaks System.out.println(a); above bcs word niet meer als costante beschouwd.
        Instrument drum = new Instrument();
        drum.makeSound();
//        System.out.println(Instrument.name); => werkt enkel als nested klasse + nested variable static zijn
    }
}
