package pl.sdacademy.java.advance.day3.Task33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImageFinder {
    public static <Steram> List<String> find(Path directory){
      try(Stream<Path> walk =  Files.walk(directory)){
          return walk.map(path -> path.toFile().getName()) // przemapowujemy na File żeby  mieć dostęp do metod
         // return walk.map(path -> path.toFile()) // przemapowujemy na File żeby  mieć dostęp do metod
                 // .filter(file -> file.getName().endsWith("png" ) || file.getName().endsWith("jpg"))
                  .filter(name -> name.endsWith("png" ) || name.endsWith("jpg"))
              //    .map(file -> file.getName())
                  .collect(Collectors.toList());
      }catch (IOException e){
          System.out.println("Exception: " + e);
      }

      return Collections.emptyList();
    }
}
