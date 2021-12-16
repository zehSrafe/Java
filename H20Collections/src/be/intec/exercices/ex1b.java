package be.intec.exercices;

import java.util.*;

public class ex1b {
    public static void main(String[] args) {
        methodTwo();
    }

    private static void methodOne() {
        Scanner input = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        String lastWord = "";

        while (!lastWord.endsWith(".")){
            System.out.println("Give word:");
            lastWord = input.nextLine();
            linkedList.add(lastWord);
        }

        input.close();
        System.out.println("");
        linkedList.forEach(System.out::println);

        System.out.println("");
        Collections.reverse(linkedList);
        linkedList.forEach(System.out::println);
    }

    private static void methodTwo(){
        List<String> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.println("Give words");

        do {
            word = scanner.next();
            wordList.add(word);
        } while (!word.endsWith("."));
        scanner.close();

        System.out.println("");
        wordList.forEach(System.out::println);

        System.out.println("");
//        Collections.reverse(wordList);
//        wordList.forEach(System.out::println);
        for (int i = wordList.size() - 1; i > -1; i--){
            System.out.println(wordList.get(i));
        }

        System.out.println("");
        System.out.println(wordList.size());
    }
}
