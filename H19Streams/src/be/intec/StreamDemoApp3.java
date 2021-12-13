package be.intec;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemoApp3 {
    public static void main(String[] args) {
        // consumerende bewerking -> geven void terug
        IntStream.range(0, 10)
                .forEach(e -> System.out.println("Number: " + e));

        // Reducerende eindbewerking -> returns one value
        int a = IntStream.range(0, 10)
                .sum();

        int product = IntStream.range(1, 10)
                .reduce(1, (acc, e) -> acc * e);    //accumulator same as for example: int sum = 0; value is edited for each ellement we process
        System.out.println("Product: " + product);                                            // ellement -> ellement we are processing

        Stream.of("This", "is", "Potatos")
                .reduce("My sentence is: ", (acc, e) -> acc.concat(e).concat(" ")); // basically: voor elk woor dat je binnenkrijgt, voeg die toe aan acc. gaat dus elk woord een voor een aan de zin toevoegen

        // Collecterende eindbewerking -> returns multiple values
        int[] arr = IntStream.range(0, 10)
                .toArray();
    }
}
