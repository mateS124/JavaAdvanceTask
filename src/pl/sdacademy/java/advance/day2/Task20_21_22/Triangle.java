package pl.sdacademy.java.advance.day2.Task20_21_22;

public  class Triangle extends Shape{

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePermiter() {
        return a + b + c;
    }
}
