package be.intec.exercices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Stream;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Collection<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 4; i++){
            System.out.println("Number please:");
            myCollection.add(input.nextInt());
        }

        input.close();
        System.out.println("");
        myCollection.forEach(System.out::println);

        Stream<Integer> myStream = myCollection.stream();
        int total = myStream.reduce(0, (acc, e) -> acc + e);
        System.out.println(total);
        System.out.println((double) total / myCollection.size());
    }
}
