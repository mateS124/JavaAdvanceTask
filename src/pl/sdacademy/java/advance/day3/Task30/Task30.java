package pl.sdacademy.java.advance.day3.Task30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Task30 {
    public static void main(String[] args) throws IOException {
        Path dirPath = Path.of("src/pl/sdacademy/java/advance/day3/Task30");
        Path inputFile = dirPath.resolve("sda.csv");
        if (!inputFile.toFile().exists()){
            System.out.println("Plik nie istnieje!");
            return;
        }
        List<String> fileConcent = getFileConcent(inputFile);
        System.out.println(" Orginal file: " + fileConcent);

        List<String> reverseFileConcent = reverseFileContent(fileConcent);
        System.out.println("Reverse file concent: " + reverseFileConcent);

        Path outputFile = reverseFileName(inputFile);
        System.out.println("Output file name: " + outputFile.toFile().getName());

        saveFile(outputFile, reverseFileConcent);

    }

    private static List<String> getFileConcent(Path inputFile) throws IOException {
       return Files.readAllLines(inputFile);
    }

    private static List<String> reverseFileContent(  List<String> content){
        return   content.stream()
                .map(input  -> new StringBuilder(input).reverse().toString())
                .collect(Collectors.toList());

    }

    private static  Path reverseFileName(Path inputFile) {
        /*
         sda.csv.csv =>  rozszerzenie to csv
        * sda.csv => dsa.csv
        * sda => ads
        * */
        String fileName  = inputFile.toFile().getName();
        int index = fileName.lastIndexOf('.');
        String extensionWithDot = "";
        if (index > 0){
            extensionWithDot = fileName.substring(index + 1);
            fileName = fileName.substring(0, index);

        }
        String reversFileName = new StringBuilder(fileName).reverse().append(extensionWithDot).toString();
        return inputFile.getParent().resolve(reversFileName);
    }

    private static  void saveFile(Path outputFile, List<String> content) throws IOException {
        Files.write(outputFile, content);
    }
}
