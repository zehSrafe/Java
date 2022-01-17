package be.intec;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        Path path = Paths.get("H21FileIO/src/be/intec/FileIODemoApp/DemoOutput.txt");
        Path secoPath = Paths.get("H21FileIO/src/be/intec/FileIODemoApp/SecondFolder/ThirdFolder/DemoOutput.txt");
        Path copiedPath = path.getParent().resolve("CopiedFile.txt"); // will create a file in the same folder as path

        System.out.println(path);       // relative path. path starting from current project folder
        System.out.println(path.toAbsolutePath());  // absolute path. gives actual path with project path + given file name

        createFile(path);
        createFile(secoPath);

        writeDataToFile(path);
        writeDataToFile(secoPath);

        readDataFromFile(path);
        readDataFromFile(secoPath);

        copyFile(path, copiedPath);
        deleteFile(path);
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
        List<String> lines = new ArrayList<>();
        lines.add("a");
        lines.add("avddvdd");
        lines.add("sdsffda");

        try {
            Files.write(path, lines);       // must also be in try catch because if file doesnt exist...
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readDataFromFile(Path path){
        try {
            List<String> lines = Files.readAllLines(path);  // will read all lines and put them in a list
            lines.forEach(System.out::println);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deleteFile(Path path){
        try {
            Files.deleteIfExists(path);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void copyFile(Path path, Path copyPath){
        try {
            Files.copy(path, copyPath);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
