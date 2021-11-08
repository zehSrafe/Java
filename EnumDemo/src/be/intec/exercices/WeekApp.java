package be.intec.exercices;

public class WeekApp {
    public static void main(String[] args) {
        Day[] days = Day.values();
        for (Day d : days){
            System.out.println(d.name() + " is a weekday: " + d.toString());
            System.out.println("Ordinal: " + d.ordinal());
        }
    }
}
