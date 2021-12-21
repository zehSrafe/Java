package be.intec;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Box> boxMap = new TreeMap<>();  // sort values in alphabetic order of keys
        boxMap.put("Cutlery Box", new Box(100, 100, 100));
        boxMap.put("Stuffed animal Box", new Box(200, 200, 200));
        boxMap.put("litle box", new Box(200, 200, 200));
        boxMap.put("Potato Box", new Box(300, 300, 300));

        Set<Map.Entry<String, Box>> entrySet = boxMap.entrySet();   // creates a set of entries (without keys, just like a normal Set or an Array)
         entrySet.stream()
//                        .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));    // each entry will have its own key and value
                .filter(entry -> entry.getKey().endsWith("box"))
                .filter(entry -> entry.getValue().getWidth() > 50)
                .map(entry -> entry.getValue());

        boxMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
