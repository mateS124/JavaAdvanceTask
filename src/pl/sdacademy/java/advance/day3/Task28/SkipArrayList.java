package pl.sdacademy.java.advance.day3.Task28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList <E> extends ArrayList <E>{  // roszerzenie daje nam dostęp do operacji z ArrayList przy tworzeniu obiektu tej klasy


    public List<E> getEveryNthElement(int startIndex, int skip) {
        List<E> everyNthElements = new ArrayList<>();
        for (int i = startIndex; i < size(); i += skip + 1){
           everyNthElements.add(get(i));
        }
     return everyNthElements;
    }
}


