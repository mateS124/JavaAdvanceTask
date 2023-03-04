package pl.sdacademy.java.advance.day1.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Strorage {
    private Map<String, List<String>> storage;

    public Strorage() {
        this.storage = new HashMap<>();
    }

    public void addToStorage(String key , String value){
       if (storage.containsKey(key)){
           storage.get(key).add(value);
       }else {
           List<String> values = new ArrayList<>();
           values.add(value);
           storage.put(key, values);


       }


    }

    public void printValues(String key){
        System.out.println(storage.get(key));
    }

    public void findValues(String searchedValue){
       List<String> keys = storage
               .entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(searchedValue))
                .map(Map.Entry::getKey)
                //.map(entry -> entry.getKey())
               .collect(Collectors.toList());
       System.out.println(keys);

    }


}
