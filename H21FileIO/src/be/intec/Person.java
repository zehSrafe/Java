package be.intec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.Duration;

public class Person implements Serializable {// implements so we can sererialize our person when tryinh to add its object to a file
    String name;
    int age;
    String mood;
    private transient Duration timeLoggedOn;

    public Person(String name, int age, String mood) {
        this.name = name;
        this.age = age;
        this.mood = mood;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood='" + mood + '\'' +
                ", timeLoggedOn='" + timeLoggedOn + '\'' +
                '}';
    }

    private void readObject(ObjectInputStream oos){
        try {
            oos.defaultReadObject();    // reads an object in normal manner. we use this so we can change data below
            timeLoggedOn = Duration.ZERO;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
