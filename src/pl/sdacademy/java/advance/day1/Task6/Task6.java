package pl.sdacademy.java.advance.day1.Task6;

import java.util.Map;
import java.util.TreeMap;

public class Task6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> test = new TreeMap<>();
        test.put(5, "Dziś");
        test.put(4, "To");
        test.put(7, "Hanna");
        test.put(12, "Ania");
        test.put(8, "SDA");

        firstAndLastElementTreeMap(test);

    }



    public static void firstAndLastElementTreeMap(TreeMap<Integer, String> input){
        int i = 1;
        for ( Map.Entry entry : input.entrySet()){
            if (i == 1 ){
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ".");
            }else if (i == input.size()){
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ",");
            }
            i++;

        }
    }
}
