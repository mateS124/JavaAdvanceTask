package pl.sdacademy.java.advance.day1.task4;

public class Task4 {
    public static void main(String[] args) {
        Strorage storage = new Strorage();
        storage.addToStorage("0", "value 0_1");
        storage.addToStorage("1", "value 1_1");
        storage.addToStorage("0", "value 0_2");
        storage.addToStorage("1", "value 0_1");
        storage.addToStorage("2", "value 2_1");
        System.out.println("printValues");
        storage.printValues("2");

        System.out.println("findValues");
        storage.findValues("value0_1");
    }
}
