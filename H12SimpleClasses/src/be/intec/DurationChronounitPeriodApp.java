package be.intec;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationChronounitPeriodApp {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2000, 12, 13);
        LocalDate nowDate = LocalDate.now();

        Period periodSinceBirth = Period.between(birthDate, nowDate);

        System.out.println("(" + birthDate + ") Walking on earth since " + periodSinceBirth.getYears() + " years, " + periodSinceBirth.getMonths() + " months and " + periodSinceBirth.getDays() + " days");

        System.out.println("Total amount of days: " + ChronoUnit.DAYS.between(birthDate, nowDate));
        System.out.println("Total amount of weeks: " + ChronoUnit.WEEKS.between(birthDate, nowDate));
        System.out.println("Total amount of months: " + ChronoUnit.MONTHS.between(birthDate, nowDate));
        System.out.println("Total amount of months: " + periodSinceBirth.toTotalMonths());

        System.out.println(ChronoUnit.DAYS.between(birthDate, nowDate));
    }
}
