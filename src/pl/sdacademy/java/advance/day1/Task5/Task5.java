package pl.sdacademy.java.advance.day1.Task5;

import java.util.HashSet;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Set<Object> sdaHash = new HashSet<>();
        SDAHashSet test = new SDAHashSet(sdaHash);
        test.addToSDAHashSet("Tomek");
        test.contains( "Tomek");
        test.addToSDAHashSet("12");
        System.out.println(test.toString());
        test.clearSDAHashSet();
        System.out.println(test.toString());
    }
}
