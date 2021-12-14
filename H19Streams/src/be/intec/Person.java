package be.intec;

import java.util.Objects;

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

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, Gender.MEN, age, 59.2f, 1.73f);
    }

    public int getAge() {
        return age;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Float.compare(person.mass, mass) == 0 && Float.compare(person.length, length) == 0 && firstName.equals(person.firstName) && lastName.equals(person.lastName) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, age, mass, length);
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s is a %s of %d years old. weighs about %.2fkg for a length of %.2fm", firstName, lastName, gender, age, mass, length);
    }

    public enum Gender{
        MEN, WOMEN, X
    }
}
