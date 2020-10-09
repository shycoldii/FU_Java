package third.converter;

public class fahrtocel implements converter{

    @Override
    public double getConvertedValue(double baseValue) {
        return (baseValue-32) /1.8;
    }
}
