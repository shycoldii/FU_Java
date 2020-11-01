package preparing_work.second_task;

import java.util.Scanner;

public class Mobile_pay extends Payment{

    @Override
    public void top_up_card() {
        System.out.println("*Пополнение с телефона карты*");
        Scanner scanner = new Scanner(System.in);
        System.out.println("*Выберите, какого типа карту хотите выбрать.*");
        System.out.println("*Социальная | Тройка*");
        String response = scanner.next();
        if (response.toLowerCase().equals("социальная")){
            System.out.println("*Студенческая | Школьная | Пенсионерам*");
            String responce_1 = scanner.next();
            if (responce_1.toLowerCase().equals("студенческая")){
               //TODO: сделать тут все условия (сделать списания  и пополнения каждой из карт по своему тарифу)
                //TODO: сделать терминал потом для проверки всего этого
                //TODO: общий интерфейс типо вызов мобильного и банкомата (обернуть в бесконечный)
                //TODO: сделать функцию просмотра баланса
            }
            else if(responce_1.toLowerCase().equals("школьная")){

            }
            else if(responce_1.toLowerCase().equals("пенсионерам")){

            }
            else{
                System.out.println("*Выход из приложения*");
            }
        }
        else if (response.toLowerCase().equals("тройка")){
            System.out.println("*Поездки | Баланс*");
            String responce_1 = scanner.next();
            if(responce_1.toLowerCase().equals("поездки")){

            }
            else if(responce_1.toLowerCase().equals("баланс")){

            }
        }
    }
}
