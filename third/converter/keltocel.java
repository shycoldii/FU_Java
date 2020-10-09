package third.converter;

public class keltocel implements converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue - 273.15;
    }
}
