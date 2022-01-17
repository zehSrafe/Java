package be.intec;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOProcessingStreamApp {
    public static void main(String[] args) {
        Path path = Paths.get("H21FileIO/src/be/intec/ProcessingIOStreams/Processed.txt");

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
        try (FileWriter fileWriter = new FileWriter(path.toFile());
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){      //beacause we have two autoclosable things here
            bufferedWriter.write("This\n");
            bufferedWriter.write("Is fucker\n");
            bufferedWriter.write("Or is it fucker?");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readDAtaFromFile(Path path){
        try (FileReader fileReader = new FileReader(path.toFile())){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
