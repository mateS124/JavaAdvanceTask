package pl.sdacademy.java.advance.day2.Task20_21_22;

public  class Hexagon extends Shape{

   private final  double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    public double calculatePermiter() {
        return 6 * a;
    }
}
