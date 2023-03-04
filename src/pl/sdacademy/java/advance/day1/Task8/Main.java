package pl.sdacademy.java.advance.day1.Task8;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(30, 35, 40, 25, false);
        Parcel parcel1 = new Parcel(30, 30, 40, 15, true);
        Validator validator = new ParcelValidator();
        System.out.println(validator.validate(parcel));
        System.out.println(validator.validate(parcel1));
    }
}
