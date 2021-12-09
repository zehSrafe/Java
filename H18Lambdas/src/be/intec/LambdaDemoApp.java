package be.intec;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemoApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello ");
        list.add("darkness ");
        list.add("my ");
        list.add("old ");
        list.add("friend ");

        for (String w : list){
            System.out.print(w);
        }

        list.forEach(word -> System.out.println(word));    // lambda version of above

        list.forEach(System.out::println);  // prints everything in the list. method reference from above
    }
}
