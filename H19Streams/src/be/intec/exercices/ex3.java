package be.intec.exercices;

import java.util.Arrays;
import java.util.stream.Stream;

public class ex3 {
    public static void main(String[] args) {
        Person p1 = new Person("d", "d");
        Person p2 = new Person("a", "a");
        Person p3 = new Person("f", "f");
        Person p4 = new Person("v", "v");
        Person[] plebs = Stream.of(p1, p2, p3, p4)
                .toArray(Person[]::new);
        System.out.println(Arrays.toString(plebs));
    }
}
