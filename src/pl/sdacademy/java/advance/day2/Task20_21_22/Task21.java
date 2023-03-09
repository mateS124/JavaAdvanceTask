package pl.sdacademy.java.advance.day2.Task20_21_22;

import pl.sdacademy.java.advance.day2.Task20_21_22.Cube;
import pl.sdacademy.java.advance.day2.Task20_21_22.Shape;

public class Task21 {
    public static void main(String[] args) {
        Shape cube = new Cube(3);
        double cubePerimeter = cube.calculatePermiter();
        System.out.println("Cube perimeter " +cubePerimeter);

       // Shape3D cube3d = new Cube(4);
        double cubeVolume = ((Cube) cube).calculateVolume();
        System.out.println("Cube Volume " + cubeVolume);
    }
}
