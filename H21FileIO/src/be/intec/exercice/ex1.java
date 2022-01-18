package be.intec.exercice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

public class ex1 {
    public static void main(String[] args) {
        Path path = Paths.get("H21FileIO/src/be/intec/exercices/ex1.txt");

        createFile(path);
        writeDataToFile(path);
        readDAtaFromFile(path);
//        renameFile(path);
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
        try (FileWriter fileWriter = new FileWriter(path.toFile())){  //.toFile gets file form path.   opens the actual file on this line
            fileWriter.write("Hello\n");
            fileWriter.write("Mother fucker\n");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readDAtaFromFile(Path path){
        try (FileReader fileReader = new FileReader(path.toFile())){
            int character;
            while ((character = fileReader.read()) != -1){      //saves value to charachter and compares it
                System.out.print((char) character);     // print and not println otherwise each char will be under elkaar
            }
            System.out.println("Owner: " + Files.getOwner(path));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void renameFile(Path path){
        try {
            Files.move(path, path.resolveSibling("ThisFileGotRenamed.txt"), StandardCopyOption.REPLACE_EXISTING);
            // will override old file if file with renaming name already exists
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
