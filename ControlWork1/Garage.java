package ControlWork1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<Car,Integer> map = new HashMap<>();
    private final int maxCapacity;
    private int flag;

    public Garage(Map<Car, Integer> map, int maxCapacity){
        this.maxCapacity = maxCapacity;
        int size = 0; //считаем общее количество машин
        for(int i: map.values()){
            size+=i;
        }
        if (size <= this.maxCapacity) {
            this.map = map;
            this.flag = 1;
            System.out.println("Автомобили успешно помещены!");
        }
        else{
            System.out.println("Не удалось поместить автомобили.");
            System.out.println("Совет: попробуйте убрать некоторые или один, допустимый размер гаража - "+maxCapacity);
            System.out.println("Было дано: "+size);
            this.flag = 0;
        }
    }

    public void auto_info() {
        if (this.flag == 1){
            for (Map.Entry<Car, Integer> ent: map.entrySet()) {
                System.out.println(ent.getKey().toString() + " " + ent.getValue());
            }
        }
        else{
            System.out.println("Данный метод недоступен для такого набора авто.");
        }

    }
    public void auto_info_sort_by_value() {
        if (this.flag==1){
            System.out.println("Сортировка по количеству:");
            ArrayList<Map.Entry<Car, Integer>> arr = new ArrayList<>(map.entrySet());
            arr.sort((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue()));
            for (Map.Entry<Car, Integer> ent: arr) {
                System.out.println(ent.getKey().getName().toString() + " " + ent.getValue());
            }

        }
        else{
            System.out.println("Данный метод недоступен для такого набора авто.");
        }

    }
    public void auto_info_sort_by_price() {
        if (this.flag == 1){
            System.out.println("Сортировка по цене автомобиля:");
            ArrayList<Map.Entry<Car, Integer>> arr = new ArrayList<>(map.entrySet());
            arr.sort((o1, o2) -> Integer.compare(o1.getKey().getPrice(), o2.getKey().getPrice()));
            for (Map.Entry<Car, Integer> ent: arr) {
                System.out.println(ent.getKey().getName().toString() + " " + ent.getKey().getPrice());
            }
        }
        else{
            System.out.println("Данный метод недоступен для такого набора авто.");
        }
    }

}
