package pl.sdacademy.java.advance.day2.Task20_21_22;

public  class Rectangle extends Shape{

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double calculatePermiter() {
        return (2 * a) + (2 * b);
    }
}
