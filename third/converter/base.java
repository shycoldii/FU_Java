package third.converter;

import java.util.Arrays;

public class base {
    private double baseValue;
    private char base;
    private final Character[] AvBase = {'K', 'C', 'F'};

    base(double baseValue){
        base = 'C'; //база сейчас
        this.baseValue = baseValue;//значение базы
    }

    base(double baseValue, boolean isFahr){
        if(isFahr){
            base = 'F';
            this.baseValue = baseValue;
        }
        else{
            base = 'K';
            this.baseValue = baseValue;
        }

    }
    public char getBase() {
        System.out.println(base);
        System.out.println(baseValue);
        return base;
    }
    public boolean setBase(char base){
        if(base == this.base)
            return true;
        if(Arrays.asList(AvBase).contains(base)) {
            switch(this.base){
                case 'C':
                    if(base == 'F'){
                        this.baseValue = new celtofahr().getConvertedValue(this.baseValue); //рез
                    }
                    else{
                        this.baseValue = new celtokel().getConvertedValue(this.baseValue);
                    }
                    break;
                case 'F':
                    this.baseValue = new fahrtocel().getConvertedValue(this.baseValue);
                    break;
                case 'K':
                    this.baseValue = new keltocel().getConvertedValue(this.baseValue);
                    break;
            }
            this.base = base;
            return true;
        }
        else{
            return false;
        }
    }
}
