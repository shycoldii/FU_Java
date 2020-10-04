package ControlWork1;

public class Mercedes extends Car{
    private int height;

    public Mercedes(String color, int maxSpeed, int currentSpeed, String box, int price, int height) {
        super(color, box, maxSpeed, currentSpeed, price);
        this.height = height;
    }
}
