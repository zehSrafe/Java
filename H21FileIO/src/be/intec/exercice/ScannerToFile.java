package be.intec.exercice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ScannerToFile {
    public static void main(String[] args) {
        Path path = Paths.get("H21FileIO/src/be/intec/exercice/ScannerInput.txt");
        List<String> inputList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("You can now start typing. Type 'exit' when you're done");

        String receivedInput;
        while (!Objects.equals(receivedInput = input.nextLine(), "exit")){
            inputList.add(receivedInput);
        }
        input.close();

        createFile(path);
        writeDataToFile(path, inputList);
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

    private static void writeDataToFile(Path path, List<String> input){
        try (FileWriter fileWriter = new FileWriter(path.toFile());
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){      //beacause we have two autoclosable things here
            for (String s : input){
                s = s.trim();
                bufferedWriter.write(s.substring(0, 1).toUpperCase());
                bufferedWriter.write(s.substring(1).toLowerCase());
                if (!s.endsWith(".") || !s.endsWith("?") || !s.endsWith("!")){
                    bufferedWriter.write(".");
                }
                bufferedWriter.write("\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
