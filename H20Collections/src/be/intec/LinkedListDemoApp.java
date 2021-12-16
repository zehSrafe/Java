package be.intec;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemoApp {
    public static void main(String[] args) {
        List<String> myLinkedList= new LinkedList<>();
        myLinkedList.add("Java");
        myLinkedList.add("Python");
        myLinkedList.add("Cobol");
        myLinkedList.add("Go");
        myLinkedList.add("Python");

        myLinkedList.forEach(System.out::println);
    }
}
