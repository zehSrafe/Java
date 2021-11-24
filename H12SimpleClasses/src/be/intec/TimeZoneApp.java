package be.intec;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneApp {
    public static void main(String[] args) {
        System.out.println("Current location: " + ZonedDateTime.now());
        System.out.println("Current location: " + ZoneId.systemDefault());
        System.out.println("London: " + ZonedDateTime.now(ZoneId.of("Europe/London")));
        System.out.println("Sydney: " + ZonedDateTime.now(ZoneId.of("Australia/Sydney")));
        System.out.println("Adelaide: " + ZonedDateTime.now(ZoneId.of("Australia/Adelaide")));
        System.out.println("UTC-4: " + ZonedDateTime.now(ZoneId.of("UTC-4")));
    }
}
