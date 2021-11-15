package be.intec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeFormatterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a date in a format DD/MM/YYYY");
        String date = input.next();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate convertedDate = LocalDate.parse(date, myFormat);
        System.out.println(convertedDate);
    }
}
