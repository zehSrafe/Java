package be.intec.exercices;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(6);
        set.add(420);
        set.add(69);
        set.add(7);
        set.add(2);

        set.forEach(System.out::println);   //will print from lowest to greatest
        System.out.println(set.ceiling(10)); // will either return 10 or the first greater number than 10
        System.out.println(set.higher(10)); // returns number higher than 10
        System.out.println(set.lower(3));   //returns number lower than 3
    }
}
