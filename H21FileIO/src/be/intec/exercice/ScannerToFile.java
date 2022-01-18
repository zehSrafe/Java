package be.intec.exercice;

import java.io.*;
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
        while (!Objects.equals(receivedInput = input.nextLine().toLowerCase(), "exit")){
            inputList.add(receivedInput);
        }
        input.close();
        if (!inputList.isEmpty()){
            createFile(path);
            writeDataToFile(path, inputList);
            readDataFromFile(path);
        } else {
            System.out.println("Received no data. Aborting mission");
        }
    }

    private static void createFile(Path path){
        try {
            Files.createDirectories(path.getParent());
            if (!Files.exists(path)){
                Files.createFile(path);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void writeDataToFile(Path path, List<String> input){
        try (FileWriter fileWriter = new FileWriter(path.toFile(), true);   // true makes it so you can append
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            for (String s : input){
                s = s.trim();
                bufferedWriter.write(s.substring(0, 1).toUpperCase());
                bufferedWriter.write(s.substring(1).toLowerCase());
                if (!(s.endsWith(".") || s.endsWith("?") || s.endsWith("!"))){
                    bufferedWriter.write(".");
                }
                bufferedWriter.write("\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readDataFromFile(Path path){
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
