package pl.sdacademy.java.advance.day1.Task9_11;

public class Circle implements Movable {
    private Point2D center;
    private Point2D point;
    private double x;
    private double y;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    /*
    pierwiastek ((x - h)^2 + (y - k)^2) = r)
    */

    public double getRadius(){
     return Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() -center.getX(),2));

    }
   /*
   2*pi*r
   */
    public double getPerimeter(){
     return  2 * getRadius() * Math.PI ;
    }
    /* pi* r*r(r^2)
    */
    public double getArea(){
     return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
      center.move(moveDirection);
      point.move(moveDirection);
    }
}
