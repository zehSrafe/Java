package be.intec;

import java.time.DayOfWeek;

public class DaysApp {
    public static void main(String[] args) {
        int dayNumber = 2;
        int toAdd = 5;
        DayOfWeek currentDay = DayOfWeek.of(dayNumber);

        System.out.println("Current day: " + currentDay);
        System.out.println("Current day + " + toAdd + " days: " + currentDay.plus(toAdd));
    }
}
