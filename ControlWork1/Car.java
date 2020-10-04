package ControlWork1;

import java.util.Scanner;

public abstract class Car {
    private String color, box;
    private int maxSpeed, currentSpeed;
    private Scanner scan = new Scanner(System.in);
    public int price;

    public Car(String color,String box, int maxSpeed, int currentSpeed, int price){
        this.color = color;
        this.box = box;
        this.maxSpeed = maxSpeed;
        this.currentSpeed =currentSpeed;
        this.price = price;
    }
    public void start() {
        int speed = scan.nextInt();
        accelerate(speed);
    }

    public void stop() {

        currentSpeed = 0;
    }
    private void accelerate (int speed) {
        if (speed + currentSpeed <= maxSpeed)
            maxSpeed = speed + currentSpeed;
    }
}
