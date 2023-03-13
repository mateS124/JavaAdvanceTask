package pl.sdacademy.java.advance.day3.Task27;

import java.util.PrimitiveIterator;

public class Person {
    private  final String name;
    private  final String lastName;
    private  final int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
