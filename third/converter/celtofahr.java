package third.converter;

public class celtofahr implements converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return  1.8 * baseValue + 32;
    }
}
