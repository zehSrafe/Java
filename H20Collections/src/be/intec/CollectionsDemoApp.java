package be.intec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsDemoApp {
    public static void main(String[] args) {
        Collection<String> myCollection = new ArrayList<>();
        myCollection.add("Java");
        myCollection.add("Python");
        myCollection.add("Cobol");
        myCollection.add("Go");
        myCollection.add("Python");

        while (myCollection.contains("Python")){
            myCollection.remove("Python");      // removes first instance of "Python"
        }

        myCollection.clear();       // clears collection

        myCollection.forEach(System.out::println);






        List<String> myList= new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("Cobol");
        myList.add("Go");
        myList.add("Python");

        myList.add(1, "Inserted");
        myList.set(2, "Replaced");
        myList.remove(4);

        myList.forEach(System.out::println);
    }
}
