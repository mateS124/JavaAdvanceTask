package pl.sdacademy.java.advance.day1.Task9_11;

public class Task9 {
    public static void main(String[] args) {
        Point2D center = new Point2D(0 ,0);
        Point2D point = new Point2D(0,3);
        Circle circle = new Circle(center, point);

        System.out.println("Before move");
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        /*
        3.0
        18.84955592153876
        28.274333882308138
         */
        System.out.println("After move");
        MoveDirection moveDirection = new MoveDirection(4, -2);
        circle.move(moveDirection);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        System.out.println("Resize");
        System.out.println(circle.resize(2));
    }
}
