package control_work_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
        public static void main(String[] args){
           //============создадим несколько продуктов
                Food food_1 = new Food("блюдо","Рапунцель",400,"г",200,"превосходная паста с грибными нотками",5);
                Food food_2 = new Food("напиток","Вечерний шах и мат",200,"мл",300,"апельсиновый смузи с ананасом",5);
                Food food_3 = new Food("блюдо","Шашлычок",500,"г",400,"свиной фирменный",5);
                Food food_4 = new Food("блюдо","Шаурма",500,"г",100,"самая лучшая на районе",10);
                Food food_5 = new Food("напиток","Аристократия",200,"мл",300,"капучино на кокосовом",100);
                Food food_6 = new Food("блюдо","Птитимия",400,"г",400,"птитими с зеленой фасолью и куриной грудкой",15);
                //food_1.get_info();
                //food_2.get_info();
                //=======добавим в меню
                Menu menu = new Menu();
                menu.add_to_menu(food_1);
                menu.add_to_menu(food_1);
                menu.add_to_menu(food_2);
                menu.add_to_menu(food_3);
                menu.add_to_menu(food_4);
                menu.add_to_menu(food_5);
                menu.add_to_menu(food_6);
                menu.check_all();
                //menu.print_menu();

                //=====заказ
                client();


        }
        public static void client(){
                Tables tables = new Tables();
                tables.fill_system();
                System.out.println("Добро пожаловать в Alexandrov's! Выберите свободный столик и приступим к заказу.");
                tables.get_info();
                try{
                        Scanner scanner = new Scanner(System.in);
                        int responce = scanner.nextInt();
                        if(responce<=10 && responce >=1){
                                boolean check = tables.check_table(responce);
                                if(check){
                                        System.out.println("Стол готов!");
                                        tables.setoff(responce);
                                        order(responce,tables);
                                }
                                else{
                                        System.out.println("Стол занят.");
                                }
                        }
                }
                catch (ExceptionInInitializerError | InterruptedException ex){
                        System.out.println("сбой.");
                }


        }
        public static void order(int table,Tables tables) throws InterruptedException {
                System.out.println("Давайте закажем!");
                Menu menu = new Menu();
                menu.print_menu();
                Map<Map<Food,Integer>,Boolean> order = new HashMap<>();
                System.out.println("Что хотите заказать? Если ничего, то нажмите q.");
                while(true){
                        Scanner scanner = new Scanner(System.in);
                        String responce = scanner.next();
                        if(responce.equals("q")){
                                break;
                        }

                        if(menu.in_menu(responce)){
                                Food food = menu.get_food(responce);
                                Map<Food,Integer> food_info = new HashMap<Food,Integer>();
                                menu.check_all();
                                boolean flag = true;
                                System.out.println("Заказано!");
                                for(Map<Food,Integer> i:order.keySet()){
                                        if(i.containsKey(food)){
                                                i.replace(food,i.get(food)+1);
                                                order.replace(i,false);
                                                flag = false;
                                                break;
                                        }

                                }
                                if(flag){

                                        food_info.put(food,1);
                                        order.put(food_info,false);

                                }


                        }
                        else{
                                System.out.println("Невозможно заказать! Видимо, блюдо добавлено в стоп-лист.");
                                menu.print_stopList();
                                menu.print_menu();
                        }


                }
                System.out.println("Заказано позиций: " +order.size());
                if(order.size()!=0){

                        Order order1 = new Order(table,order);
                        order1.check_info();
                        System.out.println("...");


                        order1.change_status_for_all();


                        int c =order1.getPrice();
                        System.out.println("Заказ готов!");
                        System.out.println("Занятость столов до:");
                        tables.print_table();
                        System.out.println("Занятость столов после:");
                        tables.seton(table);
                        tables.print_table();

                }



        }
}
