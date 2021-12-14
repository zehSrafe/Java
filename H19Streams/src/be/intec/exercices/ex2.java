package be.intec.exercices;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex2 {
    public static void main(String[] args) {
        int[] intArray = {2, 3, 1, 4, 9, 420, 69};
        long countNumbers = IntStream.of(intArray)
                .count();
        System.out.println(countNumbers);
/////////////////////////////////////////////////////////////////////
        OptionalInt maxNumbers = IntStream.of(intArray)
                .max();
//        if (maxNumbers.isPresent()) {
            System.out.println(maxNumbers.getAsInt());
//        } else {
//            System.out.println("No result");
//        }
/////////////////////////////////////////////////////////////////////
        OptionalInt minNumbers = IntStream.of(intArray)
                .min();
        System.out.println(minNumbers.getAsInt());
/////////////////////////////////////////////////////////////////////
        OptionalDouble avgNumbers = IntStream.of(intArray)
                .average();
        System.out.println(avgNumbers.getAsDouble());
/////////////////////////////////////////////////////////////////////
        int sumNumbers = IntStream.of(intArray)
                .sum();
        System.out.println(sumNumbers);
/////////////////////////////////////////////////////////////////////
        int sumQuadraatNumbers = IntStream.of(intArray)
                .reduce(0, (acc, e) -> (int) (acc + Math.pow(e, 2)));
        System.out.println(sumQuadraatNumbers);
/////////////////////////////////////////////////////////////////////
        String[] words = {"This", "day", "is", "a", "good", "day"};
        String singleLineArray = Stream.of(words)
                .reduce("", (acc, e) -> acc + e + ";");
        // achieves same as above
//            .reduce("", (acc, e) -> acc.concat(e).concat(";"));
        System.out.println(singleLineArray);
    }
}
