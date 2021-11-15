package be.intec;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateTimeApp {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2000, 12, 13);

        System.out.println("Day of year: " + birthDate.getDayOfYear());
        System.out.println("Day of month: " + birthDate.getDayOfMonth());
        System.out.println("Day of week: " + birthDate.getDayOfWeek());
        System.out.println("Is a leap year: " + birthDate.isLeapYear());
    }
}
