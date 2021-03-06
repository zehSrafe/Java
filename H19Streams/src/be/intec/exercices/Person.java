package be.intec.exercices;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;    // better to use birthdate in a real application
    private float mass;
    private float length;

    public Person(String firstName, String lastName) {
        this(firstName, lastName, Gender.MEN, 21, 59.2f, 1.73f);
    }

    public Person(String firstName, String lastName, Gender gender, int age, float mass, float length) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.mass = mass;
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("%s %s is a %s of %d years old. weighs about %.2fkg for a length of %.2fm", firstName, lastName, gender, age, mass, length);
    }

    public enum Gender{
        MEN, WOMEN, X
    }
}
