package be.intec.exercices;

import java.util.ArrayList;
import java.util.Optional;

public class arrayListEx {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("String 1");
        array.add("String 2");

        String stringToPrint = array.get(0);

        System.out.println(stringToPrint);
    }
}
