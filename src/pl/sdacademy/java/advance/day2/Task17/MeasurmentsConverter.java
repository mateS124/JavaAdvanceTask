package pl.sdacademy.java.advance.day2.Task17;

public class MeasurmentsConverter {
    public float convert(float value, ConversionType conversionType){
        return value * conversionType.getValue();


    }

    public float convert(float value, ConversionTypeWithFunction conversionType){
      return  conversionType.getConversionType().apply(value);
    }
}
