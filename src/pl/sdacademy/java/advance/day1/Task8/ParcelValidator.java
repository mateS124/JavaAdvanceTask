package pl.sdacademy.java.advance.day1.Task8;

import java.util.PrimitiveIterator;

public class ParcelValidator implements Validator {
    private static final int TOTAL_MAX_LENGTH = 300;
    private static final int SINGLE_MIN_LENGHT = 30;
    private static final int MAX_WEIGHT_FOR_EXPRESS = 15;
    private static final int MAX_WEIGHT_FOR_NOT_EXPRESS = 30;

    @Override
    public boolean validate(Parcel input) {

        return isXYZLessThan300(input)
                && isAllDimensionsLessThan30(input)
                && isWeightCorrect(input) ;
    }

    private static boolean isXYZLessThan300(Parcel input) {
        return (input.getxLength() + input.getyLength() + input.getzLength()) <= TOTAL_MAX_LENGTH;
    }

    private static boolean isAllDimensionsLessThan30(Parcel input){
       return (input.getxLength() < SINGLE_MIN_LENGHT) && (input.getzLength() < SINGLE_MIN_LENGHT) && (input.getzLength() < SINGLE_MIN_LENGHT);
    }
    private static boolean isWeightCorrect( Parcel input){
        return (input.isExpres() && input.getWeight() < MAX_WEIGHT_FOR_EXPRESS) || (!input.isExpres() && input.getWeight() < MAX_WEIGHT_FOR_NOT_EXPRESS);
    }
}
