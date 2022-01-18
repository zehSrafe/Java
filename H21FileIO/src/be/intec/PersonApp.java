package be.intec;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonApp {
    public static void main(String[] args) {
        Path path = Paths.get("H21FileIO/src/be/intec/PersonToFile/Person.txt");
        Person person = new Person("Loïc", 21, "Good");

        createFile(path);
        writeObjectToFile(path, person);
        readDAtaFromFile(path);
    }

    private static void createFile(Path path){
        try {
            Files.createDirectories(path.getParent());  // getParent goes one level up inside folder. .resolve goes one in
            if (!Files.exists(path)){
                Files.createFile(path);    //must create directories before file. getParent goes one "/" higher in path
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readDAtaFromFile(Path path){
        try (FileInputStream fileInputStream = new FileInputStream(path.toFile());
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            Person personObject = (Person) objectInputStream.readObject();  // Can throw ClassNotFoundException
            System.out.println(personObject);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeObjectToFile(Path path, Person person){
        try (FileOutputStream fileOutputStream = new FileOutputStream(path.toFile());
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
