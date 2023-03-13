package pl.sdacademy.java.advance;

import java.util.List;

public class VarArgs {
    public static void main(String[] args) {
        print(List.of("ala", "ma", " kota"));
        System.out.println("******");
        print(List.of(new String[]{"ala", "ma", " kota"}));  //pry tablicy jesteśmy ograniczeni liczbą elementów
        printUsingVarargs("ala", "ma", " kota");  // możemy podawać zmienną ilość argumentów, przyjmuje jako tablice
                                                         // varargs musi być na końcu
    }

    private  static void print(List<String> inputs){
        for (String input : inputs ){
            System.out.println(input);
        }
    }

    private  static void print(String[] inputs){
        for (String input : inputs ){
            System.out.println(input);
        }
    }

    private  static void printUsingVarargs(String ... inputs){
        for (String input : inputs ){
            System.out.println(input);
        }
    }



   /* private  static void printUsingVarargs(String secondValue , String ... inputs){ //Możemy podać kilka argumentów wejsćiowych
        for (String input : inputs ){                                               // varargs musi być na końcu
            System.out.println(input);
        }
    }*/
}
