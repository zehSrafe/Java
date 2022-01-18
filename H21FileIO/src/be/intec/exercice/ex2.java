package be.intec.exercice;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex2 {
    public static void main(String[] args) {
        Path path = Paths.get("H21FileIO/src/be/intec/exercices/ex2.txt");

        createFile(path);
//        setFileReadOnly(path);  // should generate error bcs we set readonly then try to write
//        setFileWritable(path);
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
        // below is a try with recources. will automatically executes fileWriter.close() when done with try-catch
        // only saves data to file when file is closed with .close()
        try (FileWriter fileWriter = new FileWriter(path.toFile(), true);   // true makes it so you can append
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){ //.toFile gets file form path.   opens the actual file on this line
            bufferedWriter.write("Hello\n");
            bufferedWriter.write("Mother fucker\n");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readDAtaFromFile(Path path) {
        try (FileReader fileReader = new FileReader(path.toFile())) {
            int character;
            while ((character = fileReader.read()) != -1) {      //saves value to charachter and compares it
                System.out.print((char) character);     // print and not println otherwise each char will be under elkaar
            }
            System.out.println("Owner: " + Files.getOwner(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void setFileReadOnly(Path path){
        path.toFile().setReadOnly();
    }

    private static void setFileWritable(Path path){
        path.toFile().setWritable(true);
    }
}
