package be.intec.exercices;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private float mass;
    private float length;

    public Person(String firstName, String lastName) {
        this(firstName, lastName, 21, 59.2f, 1.73f);
    }

    public Person(String firstName, String lastName, int age, float mass, float length) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mass = mass;
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old. weighs about %.2fkg for a length of %.2fm", firstName, lastName, age, mass, length);
    }
}
