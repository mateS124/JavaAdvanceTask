package pl.sdacademy.java.advance.day3.Task27;

public class task27 {
    public static void main(String[] args) {
        Joiner joiner = new Joiner<>("|");               // Nie musimy podawać typu
        String result = joiner.join("a", "b", "c", "d");
        System.out.println(result);

        Joiner<Double> joiner2 = new Joiner<>("+");
        String result1 = joiner2.join(2.0, 5.0, 6.3);
        System.out.println(result1);

        Joiner<Boolean> joiner3 = new Joiner<>("?");
        String result3 = joiner3.join(true, false, true);
        System.out.println(result3);

        Joiner<Person> joiner4 = new Joiner<>("_");
        result = joiner4.join( new Person("Ala", "Nowak", 30),
                               new Person("Jan", "Kowalski", 40));
        System.out.println(result);
    }
}
