package pl.sdacademy.java.advance.day2.task18_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task18_19 {
    public static void main(String[] args) {
        Computer intel = new Computer("Intel i7", "Kingston 16GB", "Nvidia 3090", "HP","1018");
        Computer amd = new Computer("Ryzen 7", "Corsair 16GB", "Radeon 6700", "Razer","G500");
        Computer amd2 = new Computer("Ryzen 7", "Kingston 16GB", "Radeon 6700", "Razer","G500");
        Computer laptop = new Computer("Intel i9","Samsung 32GB", "Nvidia 4090", "Dell", "Gaming18Pro");



        System.out.println(intel);
        System.out.println(amd);
        System.out.println(intel.equals(amd));
        System.out.println(intel.getRam().equals(amd2.getRam()));

        List<Computer> computers = new ArrayList<>();
        computers.add(intel);
        computers.add(amd);
        computers.add(amd2);
        computers.add(laptop);

        for (Computer computer : computers){
            System.out.println("Computer processor: " + computer.getCpu() + "\n  computer ram: " + computer.getRam() + "\n");
        }

        System.out.println(computers.get(3));

        System.out.println(computers.size());


        Arrays.stream(computers.toArray())
                .sorted();

        System.out.println(computers.toString());

    }
}
