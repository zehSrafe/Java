package be.intec.demo;

import java.util.ArrayDeque;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        SchoolClass sc = new SchoolClass();
        Optional<String> secondStudent = sc.getStudent(2);
        Optional<String> thirdStudent = sc.getStudent(3);
        Optional<String> outOfBoundStudent = sc.getStudent(4);

        printStudent(secondStudent);
        printStudent(thirdStudent);
        printStudent(outOfBoundStudent);
        // Optionals are usefull when you know you run the risk not to get the desired object
        // could have been usefull for iceCreamShop

        ArrayDeque<String> ad = new ArrayDeque<String>(); // "<String>" in new ArrayDeque<String>() is onnodig vanaf java 8
    }

    public static void printStudent(Optional<String> student){
        if (student.isPresent()){      // .isPresent() is a method of Optionals
            System.out.println(student.get().toUpperCase()); // .get() geeft het object terug van het gegeven datatype
        } else {
            System.out.println("Student not arrived yet");
        }
    }
}
