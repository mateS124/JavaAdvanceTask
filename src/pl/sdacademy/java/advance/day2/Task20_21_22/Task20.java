package pl.sdacademy.java.advance.day2.Task20_21_22;

public class Task20 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        double rectanglePerimeter = rectangle.calculatePermiter();
        System.out.println("Rectangle perimeter " + rectanglePerimeter);

        Shape triangle = new Triangle(2, 3, 4);
        double trianglePerimeter = triangle.calculatePermiter();
        System.out.println("Triangle perimeter " + trianglePerimeter);

        Shape hexagon = new Hexagon(2);
        double hexagonPerimeter = hexagon.calculatePermiter();
        System.out.println("Hexagon perimeter " + hexagonPerimeter);
    }
}
