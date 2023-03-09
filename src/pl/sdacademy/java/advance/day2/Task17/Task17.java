package pl.sdacademy.java.advance.day2.Task17;

public class Task17 {
    public static void main(String[] args) {
        MeasurmentsConverter converter = new MeasurmentsConverter();
        float result = converter.convert(10, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(result);

        float result1 = converter.convert(10, ConversionTypeWithFunction.CENTIMETERS_TO_INCHES);
        System.out.println(result1);
    }
}
