package pl.sdacademy.java.advance.day2.Task16;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum Runner {
    BEGGINER(1024, Integer.MAX_VALUE),
    INTERMEDIATE(512, 1024),
    ADVANCE(0, 512);

    private final int minMinutes;

    private final int maxMinutes;

    /*
    * Mozna też values() zamienic na
    * private static final Runner[] VALUES = values();
    * */

    Runner(int minMinutes, int maxMinutes) {
        this.minMinutes = minMinutes;
        this.maxMinutes = maxMinutes;
    }

    public static Runner getFitnessLevel(int runningTime){
      return   Arrays.stream(values())
                .filter(runner ->  runningTime > runner.minMinutes && runningTime < runner.maxMinutes)
                .findFirst()
                .orElse(BEGGINER);
                //.orElseThrow(() -> new IllegalArgumentException("Podany czas jest spoza możliwych przedziałów"));



    }
}
