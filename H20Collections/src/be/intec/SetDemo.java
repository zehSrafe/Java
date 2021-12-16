package be.intec;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Hello");
        set.add("it's");
        set.add("me");
        set.add("hjsahjska");
        set.add("I");
        set.add("was wondering");
        set.add("me");  // duplicates are not registered

        set.forEach(System.out::println);       // gives different than registered in the hashset
    }
}
