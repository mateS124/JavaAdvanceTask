package pl.sdacademy.java.advance.day3.Task28;

import java.util.List;

public class Task28 {
    public static void main(String[] args) {
        SkipArrayList skipArrayList = new SkipArrayList();
        skipArrayList.addAll(List.of("a", "b", "c", "d", "e", "f", "g", "h", " i", "j", "k", "l" ));
       List<String> everyNthElement =  skipArrayList.getEveryNthElement(2, 3);
        System.out.println(everyNthElement);

        SkipArrayList<Integer> skipArrayList2 = new SkipArrayList<>();
        skipArrayList2.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        List<Integer> everyNthElement_2 = skipArrayList2.getEveryNthElement(5, 3);
        System.out.println(everyNthElement_2);
    }
}
