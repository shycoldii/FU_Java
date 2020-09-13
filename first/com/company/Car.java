package com.company;

public class Car {

    private String color;
    private int speed; // аттрибуты
    private String model; // приватный, значит только внутри
    // конструктор
    public Car(String color, int speed, String model){ // Метод, который принимает объекты
        this.color = color;
        this.speed = speed;
        this.model = model;
    }

    public String getModel(){ //возвращение значения
        return model;
    }
    public void setModel(String val){
        model = val;
    }
    public double speedInMiles(){
        return speed * 0.85;
    }
    public String speedInMiles(boolean condition){
        return String.valueOf(speed*0.85)+" миль/час"; //из дабл в строку, а весь метод -перегрузка
    }
    // статический работает вне контекста объекта
    public static String hello(String val){
        return "hello"+val;
    }
    // Тут можно наследоваться только от 1 класса, а в питоне групповуха есть
}
