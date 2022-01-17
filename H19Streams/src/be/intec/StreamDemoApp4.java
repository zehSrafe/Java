package be.intec;

import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamDemoApp4 {
    public static void main(String[] args) {
        Person p1 = new Person("loi", "d");
        Person p2 = new Person("Loïc", "D");
        Person ps = new Person("loïc", "D");
        Person pd = new Person("Loïc", "D");
        Person p3 = new Person("loic", "f");
        Person p4 = new Person("v", "v");

        Stream.of(p1, p2, ps, pd, p3, p4)
                .distinct()                 // (should be first or at least before any limitation line such as .limit() or .skip()) makes sure you don't get identical objects in result.
                                            // must implement equals method in Person for this to work. persons are then considered identical if they have identical values
                .sorted(Comparator.comparing(Person::getName)) // will sort the output. you have to give it something to compare
//                .filter(person -> person.getName().toLowerCase().startsWith("l"))
//                .filter(person -> person.getName().contains("c"))
//                .skip(1)                    // skips 1 element (first one coming through)
//                .limit(2)                   // limits amount of elements going through until this point
                .forEach(System.out::println);
    }
}
