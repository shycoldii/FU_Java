package preparing_work.second_task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mobile_pay extends Payment{
    private Card card;
    Mobile_pay(Card card){
        this.card = card;
    }


    @Override
    public void top_up_card() {
        System.out.println("*Пополнение с телефона карты*");
        Info.info();

        if (card.getType() == 1 || card.getType() == 2 || card.getType() == 3){
            if (card.getInfo() ==0){
                int price = Info.get_price(card.getType());
                Scanner scanner = new Scanner(System.in);
                try{
                    System.out.println("Стоимость пополнения:" + price +".Внесите сумму.");
                    int responce_1 = scanner.nextInt();
                    if(responce_1 == price){
                        this.card.increase();
                    }
                }
                catch (Exception ex){
                    System.out.println("Ошибка при работе.");
                }

            }
            else{
                System.out.println("Карта уже пополнена!");
            }

        }
        else if (card.getType() == 4){

            Scanner scanner = new Scanner(System.in);
            System.out.println("*Пополнение поездок (1) | пополнение баланса (2)*");
            String responce_1 = scanner.next();
            if(responce_1.toLowerCase().equals("1")){
                int price = Info.get_price(card.getType());
                Scanner scanner1 = new Scanner(System.in);
                try{
                    System.out.println("Стоимость пополнения:" + price +".Внесите сумму.");
                    int responce_2 = scanner1.nextInt();
                    if(responce_2 % price == 0){
                        this.card.increase(1,responce_2 / price);
                    }
                    else {
                        System.out.println("Карта не пополнена. Введите кратное число.");
                    }
                }
                catch (Exception ex){
                    System.out.println("Ошибка при работе.");
                }

            }
            else if(responce_1.toLowerCase().equals("2")){
                System.out.println("Внесите сумму.");
                Scanner scanner1 = new Scanner(System.in);
                int responce_2 = scanner1.nextInt();
                this.card.increase(2,responce_2);
            }
        }
    }

    @Override
    public void check_card() {
        Map<Integer,String> dictionary = new HashMap<Integer,String>();
        dictionary.put(1,"Школьная");
        dictionary.put(2,"Студенческая");
        dictionary.put(3,"Социальная (пожилым)");
        dictionary.put(4,"Тройка");
        System.out.println("Тип карты: "+dictionary.get(this.card.getType()));
        this.card.getInfo();
    }

}