package be.intec;

import java.time.Instant;

public class InstantApp {
    public static void main(String[] args) {
        Instant currentTime = Instant.now();
        Instant currentTimePlusSeven = currentTime.plusSeconds(7);
        Instant currentTimePlusFive = currentTimePlusSeven.plusMillis(5);
        Instant currentTimePlusThree = currentTimePlusFive.plusNanos(3);

        System.out.println("Current: " + currentTime);
        System.out.println("Current + 7s: " + currentTimePlusSeven);
        System.out.println("Current + 5ms: " + currentTimePlusFive);
        System.out.println("Current + 3ns: " + currentTimePlusThree);
    }
}
