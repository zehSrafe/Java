package be.intec;

import java.time.Instant;

public class InstantApp {
    public static void main(String[] args) {
        Instant currentTime = Instant.now();
        System.out.println("Current: " + currentTime);
        Instant currentTimePlusSeven = currentTime.plusSeconds(7);
        System.out.println("Current + 7s: " + currentTimePlusSeven);
        Instant currentTimePlusFive = currentTimePlusSeven.plusMillis(5);
        System.out.println("Current + 5ms: " + currentTimePlusFive);
        Instant currentTimePlusThree = currentTimePlusFive.plusNanos(3);
        System.out.println("Current + 3ns: " + currentTimePlusThree);
    }
}
