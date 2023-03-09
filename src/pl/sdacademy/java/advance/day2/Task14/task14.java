package pl.sdacademy.java.advance.day2.Task14;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class task14 {
    private static final int BOUND = 100;
    public static void main(String[] args) {

        List<Integer> integers = generateRandomList();

        System.out.println(integers);
        System.out.println();
        System.out.println("************** Lista unikalnych elementów **************");
        List<Integer> distinct = getUniqueElements(integers);
        System.out.println("distinct " + distinct.size());
        System.out.println(distinct);
        System.out.println();

        System.out.println("*********** Elementy, które powtórzyły się conajmniej raz ************");
        List<Integer> duplikates = getDuplicateValues(integers);
        System.out.println("duplikates" + duplikates.size());
        System.out.println(duplikates);
        System.out.println();

        System.out.println("*********** getTop25 ****************");
        List<Integer> top = getTop25(integers);
        System.out.println(top);
        System.out.println();

        System.out.println("************ generateUniqueValues ***************");
        List<Integer> generateUniqueValues = generateUniqueValues(integers);
        System.out.println(generateUniqueValues);
        System.out.println();


    }


    private static List<Integer> generateRandomList(){
        Random r = new Random();
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < BOUND; i++){
            randomList.add(r.nextInt(BOUND));
        }
        return randomList.stream().sorted().collect(toList());
    }

    public static List<Integer> getUniqueElements(List<Integer> value){
        return value
                .stream()
                .distinct()
                .collect(toList());
    }

    public  static  List<Integer> getDuplicateValues (List<Integer> values){
        return getMap(values).entrySet().stream()
                .filter(entry -> entry.getValue() >= 2 )
                .map(Map.Entry::getKey)
                .collect(toList());
    }

    public static List<Integer> getTop25(List<Integer> values){
        return getMap(values).entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(25)
                .map(Map.Entry::getKey)
                .collect(toList());
    }

    public static List<Integer> generateUniqueValues(List<Integer> values){
        List<Integer> uniqueValues = new ArrayList<>();
        values.forEach(value -> addOrGetUniqueValue(uniqueValues, value));
        return uniqueValues;
    }

    private static void addOrGetUniqueValue(List<Integer> uniqueValues, Integer value){
        Random randomGenerator = new Random(BOUND);
        while(uniqueValues.contains(value)){
            value = randomGenerator.nextInt();
        }
        uniqueValues.add(value);
    }

    private static Map<Integer, Integer> getMap(List<Integer> randomList){
        Map<Integer, Integer> result = new HashMap<>();
        randomList.forEach(key -> result.put(key, result.getOrDefault(key, 0) + 1));
        return result;
    }
}


