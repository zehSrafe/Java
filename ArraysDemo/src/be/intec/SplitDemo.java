package be.intec;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String text = "Two|things|are|infinite:|the|universe|and|human|stupidity;|and|I'm|not|sure|about|the|universe.";

        String[] textSplitInWords = text.split("\\|");

//        for (String word : textSplitInWords){
//            System.out.println(word);
//        }

        String csv = "Erik,19,Youthlane 52\n" +
                "Zuhur,75,Pensionstraat 99\n" +
                "Petit-Jean,4,La rue de frankrijk";

        String[] people = csv.split("\n");
        for (String person : people) {
            String[] personValues = person.split(",");
            String name = personValues[0];
            String age = personValues[1];
            String address = personValues[2];
//            Person person = new Person(name, age, address);
//            personArray[0] = person;
            System.out.println("Name: " + name + " Age: " + age + " address: " + address);
        }
    }
}
