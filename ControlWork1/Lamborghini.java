package ControlWork1;

public class Lamborghini extends Car{
    private final int luggage;
    public Lamborghini(String color, int maxSpeed, int currentSpeed, String box, int price,int luggage) {
        super(color, box, maxSpeed, currentSpeed, price);
        this.luggage = luggage;
    }
    @Override
    public  String getName(){
        return "Lamborghini";
    }
    public int getLuggage(){
        return this.luggage;
    }
}
