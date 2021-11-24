package be.intec;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String text = "money";
        // text = text.toUpperCase();
        text = text.concat(" very happy");
        text = text.replace('a', 'o');

        String textUppder = text.substring(0, 5);

        System.out.println(text);
        System.out.println(textUppder.toUpperCase());
        System.out.println(text.replace("money", textUppder.toUpperCase()));
    }
}
