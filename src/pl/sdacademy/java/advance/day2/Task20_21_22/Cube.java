package pl.sdacademy.java.advance.day2.Task20_21_22;

public class Cube extends Shape3D implements Fillable {
    private final double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double calculatePermiter() {
        return 12 * a;
    }

    @Override
    public double calculateVolume() {
        return  Math.pow(a, 3);
    }

    @Override
    public int fill(double volume) {
        double maxVolume = calculateVolume();
        if (maxVolume == volume){
            return 0; //wlaliśmy idealną ilość wody
        } else if (maxVolume > volume) {
            return -1; //wloalismy zbyt mało wody
        }
        return 1; //wlaliśmy za dużo wody
    }
}
