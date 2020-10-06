package ControlWork1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        Map<Car, Integer> map = new HashMap<>();

        Mercedes mercedes = new Mercedes("blue", 280, 150, "4", 20000000, 345);
        Lamborghini lamb = new Lamborghini("blue", 280, 150, "4", 10000000,20);
        map.put(lamb,1);
        map.put(mercedes,1);
        map.put(mercedes,1);
        map.compute(mercedes,((Car, Integer) -> Integer == null ? 1 : Integer+1));
        Garage garage = new Garage(map,3);
        garage.auto_info_sort_by_value();
        garage.auto_info_sort_by_price();
    }
}

