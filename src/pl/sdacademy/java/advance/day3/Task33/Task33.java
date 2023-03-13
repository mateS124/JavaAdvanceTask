package pl.sdacademy.java.advance.day3.Task33;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task33 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/pl/sdacademy/java/advance/day3/Task33");
        List<String> names = ImageFinder.find(path);
        System.out.println(names);


    }
}
