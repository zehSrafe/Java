package be.intec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterApp {
    public static void main(String[] args) {
        String date = "04/04/2020";
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate convertedDate = LocalDate.parse(date, myFormat);
        System.out.println(convertedDate);
    }
}
