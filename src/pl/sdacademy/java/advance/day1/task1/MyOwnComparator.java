package pl.sdacademy.java.advance.day1.task1;

import java.util.Comparator;

public class MyOwnComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
