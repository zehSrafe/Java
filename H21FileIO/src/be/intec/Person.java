package be.intec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDate;

public class Person implements Serializable {// implements so we can sererialize our person when tryinh to add its object to a file
    String firstName;
    String lastName;
    LocalDate birthDay;
    private transient Duration timeLoggedOn; // transient makes it so the variable isn't serializable

    public Person(String firstName, String lastName, String birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        setBirthDay(birthDay);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        String[] dates = birthDay.split("/");
        this.birthDay = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", timeLoggedOn=" + timeLoggedOn +
                '}';
    }
}
