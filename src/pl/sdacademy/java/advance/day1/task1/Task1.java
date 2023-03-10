package pl.sdacademy.java.advance.day1.task1;


import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> unsorted = List.of("A", "B", "X", "D", "C");
        List<String> result = sort(unsorted);
        List<String> result1 = sortUsingOwnComparator(unsorted);
        List<String> result2 = sortUsingLambda(unsorted);
        List<String> result3 = sortUsingSteram(unsorted);
        List<String> result4 = sortUsingList(unsorted);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);





    }

    private static List<String> sort(List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*
                o1, o2
                -> gdy  o1 wieksze od o2 zwraca +
                -> gdy o1 mniejsze od o2 zwraca -
                -> gdy o1 równe o2 zwraca 0
                */

               // return o1.compareTo(o2);  kolejność naturalna
                return -o1.compareTo(o2);  // zmienia kolejność
               // return o2.compareTo(o1);   działa jak wyżej sortuje w  odwróconej kolejności

            }
        });
        return sorted;
    }

    private static List<String>  sortUsingOwnComparator (List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }
    private static List<String>  sortUsingLambda (List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, ((o1, o2) -> -o1.compareTo(o2)));
        return sorted;
    }

    private static List<String>  sortUsingSteram (List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
       return sorted.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
             // .ListOf(sorted); w nowszej wersji Java

    }

    private static List<String>  sortUsingList (List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        return sorted;

    }
 }
