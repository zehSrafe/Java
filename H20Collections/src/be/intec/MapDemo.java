package be.intec;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Box> boxMap = new HashMap<>(); // hasmap is most used. is an unsorted map. LinkedHashMap will be sorted from oldest to newest
        boxMap.put("Cutlery Box", new Box(100, 100, 100));  // creates (or replaces existing one) a new box named cutlery box and adds it to the map
        boxMap.put("Stuffed animal Box", new Box(200, 200, 200));   // creates (or replaces existing one) a new box named Stuffed animal box and adds it to the map

        System.out.println(boxMap.get("Cutlery Box")); // gets box with given ID. in this case that ID is "Cutlery Box"

        System.out.println("");
        boxMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("");
        boxMap.keySet().forEach(System.out::println);       // prints name of each boxes
        boxMap.values().forEach(System.out::println);       // prints all values from each box

        System.out.println("");
        System.out.println(boxMap.replace("Cutlery Box", new Box(100, 100, 100), new Box(420, 420, 420)));
        // above will tell if you can replace values of 100, 100, 100 from cutlery box to 420, 420, 420
    }
}
