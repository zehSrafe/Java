package be.intec.otherExercices;

public class PlanetApp {
    public static void main(String[] args) {
        Planet[] planets = Planet.values();
        for (Planet p : planets){
            System.out.println(p.toString());
        }
    }
}
