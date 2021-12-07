package be.intec.demo;

import java.util.Optional;

public class SchoolClass {
    private String[] presentStudents = {"Ali", "Loïc", null};

    public Optional<String> getStudent(int orderArrived){
        if (orderArrived > presentStudents.length) {
            return Optional.empty();
        }

        String studentToReturn = presentStudents[orderArrived - 1];
        if (studentToReturn != null) {
            Optional<String > student = Optional.of(studentToReturn);   // om het in een varibale te steken
            return student;
        }
        return Optional.empty();    // return een object zonder iets in
    }
}
