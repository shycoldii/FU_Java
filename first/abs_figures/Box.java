package abs_figures;

import abs_figures.Shape;

import java.util.ArrayList;

class Box extends Shape {
    private double now;
    private ArrayList<Shape> box = new ArrayList<Shape>();
    private double volume;

    public Box(double now){
        this.volume = volume;
        this.now = now;
    }
    public boolean add(Shape shape){
        if (now >= shape.getVolume()){
            box.add(shape);
            now -= shape.getVolume();
            System.out.println("Состояние склада - "+ now);
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public double getVolume() {
        System.out.println("Значение объекта - "+ volume);
        return volume;
    }
}
