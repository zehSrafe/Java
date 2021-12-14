package be.intec.exercices;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex1 {
    public static void main(String[] args) {
        String[] words = {"This", "day", "is", "a", "good", "day"};
        Stream.of(words)
//                .forEach(s -> System.out.println(s));     "long" version of below
                .forEach(System.out::println);

        System.out.println("");

        IntStream.range(0, 100)
                .forEach(System.out::println);

        System.out.println("");

        Person p1 = new Person("d", "d");
        Person p2 = new Person("a", "a");
        Person p3 = new Person("f", "f");
        Person p4 = new Person("v", "v");
        Person[] plebs = {p1, p2, p3, p4};

        Stream.of(plebs)
                .forEach(System.out::println);
    }
}
