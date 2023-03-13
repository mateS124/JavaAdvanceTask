package pl.sdacademy.java.advance.day3.Task27;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner<T> {
    private final String delimiter;

    public Joiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(T ... items){
       // Arrays.stream(items)
        return  Stream.of(items)
                .map(t -> t.toString())
              //  .map(T::toString)
                .collect(Collectors.joining(delimiter));

    }
}
