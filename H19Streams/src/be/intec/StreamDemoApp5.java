package be.intec;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Stream;

public class StreamDemoApp5 {
    public static void main(String[] args) {
        Person[] plebs = new Person[]{
                new Person("loi", "d", 1),
                new Person("Loïc", "D", 2),
                new Person("loïc", "D", 3),
                new Person("Loïc", "D", 4),
                new Person("loic", "f", 5),
                new Person("v", "v", 6)
        };

        OptionalDouble averageAge = Stream.of(plebs)
                .distinct()
                .mapToInt(person -> person.getAge())        // will take all the ages from every person
                .average();

        System.out.println(averageAge.isPresent() ? averageAge.getAsDouble(): "Don't know");

        Stream.of(plebs)
                .mapToInt(person -> person.getAge())        // same as below only specifies you have int
//                .map(person -> person.getName())        // will retrieve name from incoming person and replace it with returned value from .getName()
                .peek(System.out::println)      // will "peek" at your stream data while it is still running
                .forEach(System.out::println);
    }
}
