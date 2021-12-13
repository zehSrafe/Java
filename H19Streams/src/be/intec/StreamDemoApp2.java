package be.intec;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemoApp2 {
    public static void main(String[] args) {
        iterateMethod();
    }

    private static void ifElseStreams(){
        int sum = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Potato");
            if (i % 2 == 0){
                sum++;
            } else {
                sum = i + 1;
            }
        }
        System.out.println(sum);

        // same as above for-loop
//        IntStream.rangeClosed() => including range number
//        IntStream.range() => excluding range number
        IntStream.rangeClosed(0, 10)
                .forEach(e -> System.out.println("Potato"));

        int streamSum = IntStream.range(0, 10)
                .filter(e -> e % 2 == 0)    // just like if statement
                .sum();
        System.out.println(streamSum);



        int secondStreamSum = IntStream.range(0, 10)
                .map(e -> e % 2 != 0 ? e + 1 : e)   // if-else statement
                .sum();
        System.out.println(secondStreamSum);
    }

    private static void generateStrings(){
        Stream.generate(() -> "Hello world") // generates data
                .forEach(System.out::println);  //(prints infinite hello world)
    }

    private static void generateRandomNumbers(){
        Stream.generate(() -> new Random().nextInt(50)) // generates data
                .forEach(System.out::println);  //(prints infinite random numbers)
    }

    private static void iterateMethod(){
        IntStream.iterate(10, i -> i += 1) //start at number 10. i = start (10 in this case). do i++ (i++ doen't work) each step
                .limit(20)              // max 20 elements in stream
                .forEach(System.out::println);


        IntStream.iterate(10, i -> i * 2) //start at number 10. i = start (10 in this case). do i * 2 each step
                .limit(20)              // max 20 elements in stream
                .forEach(System.out::println);
    }
}
