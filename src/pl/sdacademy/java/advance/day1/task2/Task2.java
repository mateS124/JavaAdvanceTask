package pl.sdacademy.java.advance.day1.task2;


import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<String> sortIgnoreCaseSensitive(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(new MyOwnIgnoreCaseSensitiveComparator());
        return sorted;
    }
}
