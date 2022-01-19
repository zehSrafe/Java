package be.intec.exercice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class ex5 {
    public static void main(String[] args) {
        Path path = Paths.get("H21FileIO/src/be/intec/exercices/ex5.txt");

        createFile(path);
        writeDataToFile(path);
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

    private static void writeDataToFile(Path path){
        try (FileOutputStream fileOutputStream = new FileOutputStream(path.toFile());
             DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(fileOutputStream);
             PrintStream printStream = new PrintStream(deflaterOutputStream)) {
            printStream.print("Hello\n");
            printStream.print("This is printStream\n");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readDAtaFromFile(Path path) {
        try (FileInputStream fileInputStream = new FileInputStream(path.toFile());
             InflaterInputStream inflaterInputStream = new InflaterInputStream(fileInputStream)) {
            int character;
            while ((character = inflaterInputStream.read()) != -1) {      //saves value to charachter and compares it
                System.out.print((char) character);     // print and not println otherwise each char will be under elkaar
            }
            System.out.println("Owner: " + Files.getOwner(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
