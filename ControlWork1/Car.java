package ControlWork1;

import java.util.Scanner;

public abstract class Car {
    /**
     * Родительский класс автомобиля
     */
    private final String color, type_box;
    private int maxSpeed, currentSpeed;
    public int price;

    public Car(String color,String type_box, int maxSpeed, int currentSpeed, int price){
        this.color = color;
        this.type_box = type_box;
        this.maxSpeed = maxSpeed;
        this.currentSpeed =currentSpeed;
        this.price = price;
    }
    public void start() {
        //считываем скорость с клавиатуры и прибавляем при возможности
        Scanner scan = new Scanner(System.in);
        int speed = scan.nextInt();
        accelerate(speed);
    }
    public int getPrice(){
        return this.price;
    }
    public String getColor(){
        return this.color;
    }
    public String getType_box(){
        return this.type_box;
    }
    public  String getName(){
        return "Автомобиль общего вида";
    }
    public void stop() {
        currentSpeed = 0;
    }
    private void accelerate (int speed) {
        if (speed + currentSpeed <= maxSpeed)
           currentSpeed = speed + currentSpeed;
    }
}
