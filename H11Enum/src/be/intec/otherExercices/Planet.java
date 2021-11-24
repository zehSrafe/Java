package be.intec.otherExercices;

public enum Planet {
    MERCURY(3.3 * Math.pow(10, 23), 57 * Math.pow(10, 6)),
    VENUS(4.87 * Math.pow(10, 24), 10.8 * Math.pow(10, 6)),
    EARTH(5.98 * Math.pow(10, 24), 14.9 * Math.pow(10, 6)),
    MARS(6.42 * Math.pow(10, 23) , 22 * Math.pow(10, 6)),
    JUPITER(10 * Math.pow(10, 27), 77 * Math.pow(10, 6)),
    URANUS(8.6 * Math.pow(10, 25), 28.7 * Math.pow(10, 7)),
    NEPTUNE(10 * Math.pow(10, 25), 44.9 * Math.pow(10, 7)),
    SATURN(5.6 * Math.pow(10, 26), 14.3 * Math.pow(10, 7)),
    PLUTO(1.309 * Math.pow(10, 22), 5.9 * Math.pow(10, 9)),
    ATLANTIS(2.4 * Math.pow(10, 15), 420 * Math.pow(10, 6));

    private final double mass;
    private final double distanceFromSun;

    Planet(double mass, double distanceFromSun){
        this.mass = mass;
        this.distanceFromSun = distanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    @Override
    public String toString() {
        return String.format("%s, mass: %.2f , distance from sun: %.2f", name(), mass, distanceFromSun);
    }
}
