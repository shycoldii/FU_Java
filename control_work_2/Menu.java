package control_work_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    static ArrayList<Food> stopList = new ArrayList<>(); //стоп-лист
    static ArrayList<Food> menu = new ArrayList<>();

    public ArrayList<Food> getMenu(){
        return menu;
    }
    public void print_stopList(){
        for(Food i: stopList){
            System.out.println(i.getName().toString());
        }

    }
    public void add_to_menu(Food food){
       if (!menu.contains(food) & food.getNum()!=0) {
           if (food.getType() == "блюдо" ){
               menu.add(menu.size()/2,food);
           }
           else{
               menu.add(food);
           }
       }
       else{
           System.out.println("Товар уже в меню!");
       }

    }
    public void delete_in_menu(Food food){
        if (menu.contains(food)){
            stopList.add(food);
            menu.remove(food);
        }
        else{
            System.out.println("В меню нет такого блюда.");
        }
    }
    public void stop_menu(Food food){

        if (menu.contains(food)){
            stopList.add(food);
            menu.remove(food);
        }
        else{
            System.out.println("В меню нет такого блюда.");
        }

    }
    public boolean in_menu(String food){
        for(Food i: menu){
            if(i.getName().toLowerCase().equals(food.toLowerCase())){
                i.setNum(-1);
                return true;
            }
        }
        return false;
    }
    public Food get_food(String food){
        for(Food i: menu){
            if(i.getName().toLowerCase().equals(food.toLowerCase())){

                return i;
            }
        }
        return null;
    }

    public void off_stop_menu(String food){
        for(Food i:stopList){
            if(i.getName().toLowerCase().equals(food.toLowerCase())){
                Food new_food = i;
                stopList.remove(i);
                new_food.setNum(15);
                add_to_menu(new_food);

                break;
            }
            else{
                System.out.println("В стоп-листе нет такого блюда.");
            }
        }
    }

    public void check_all(){
        for(Food i :menu){
            if (i.getNum()==0){
                stop_menu(i);
                break;
            }
        }
    }

    public void print_menu(){
        System.out.println("Alexandrov's menu");
        System.out.println("===================");
        System.out.println("Блюда");
        System.out.println("===================");
        for(Food i: menu){
            if(i.getType().equals("блюдо")){
                i.get_to_menu();
            }
        }
        System.out.println("===================");
        System.out.println("Напитки");
        System.out.println("===================");
        for(Food i: menu){
            if(i.getType().equals("напиток")){
                i.get_to_menu();
            }
        }
        System.out.println("===================");



    }


}
