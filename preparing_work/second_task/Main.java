package preparing_work.second_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //=========определители типа карты
        final int school = 1;
        final int student = 2;
        final int social = 3;
        final int troika = 4;
        //==========================================================================
        Fix_card example_1 = new Fix_card(school,true);
        Fix_card example_2 = new Fix_card(student,false);
        One_pay_Card example_3 = new One_pay_Card(troika,1000,1);
        One_pay_Card example_4 = new One_pay_Card(troika,500,0);
        One_pay_Card example_5 = new One_pay_Card(troika,0,0);
        //==========================================================================работа с юзером

        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите 1 для работы с телефоном, 2 - с банкоматом");
        String ask = scanner.next();
        if(ask.equals("1")){
            System.out.println("Перехожу в мобильный банк...");
            label:
            while(true){
                System.out.println("Можете посмотреть баланс карты, нажав 1, или пополнить, нажав 2,3-если хотите закончить работу");
                String ask2 = scanner.next();
                Mobile_pay mobile_pay = new Mobile_pay(example_4);
                switch (ask2) {
                    case "1": {
                        mobile_pay.check_card();
                        break;
                    }
                    case "2": {
                        mobile_pay.top_up_card();
                        break;
                    }
                    case "3":
                        break label;
                }

            }


        }
        else if(ask.equals("2")){
            System.out.println("Перехожу в банкомат...");
            label:
            while(true){
                System.out.println("Можете посмотреть баланс карты, нажав 1, или пополнить, нажав 2,3-если хотите закончить работу");
                String ask2 = scanner.next();
                ATM atm = new ATM(example_3);
                switch (ask2) {
                    case "1": {
                        atm.check_card();
                        break;
                    }
                    case "2": {
                        atm.top_up_card();
                        break;
                    }
                    case "3":
                        break label;
                }

            }
        }
        //пример терминала
        System.out.println("====================");
        Terminal terminal = new Terminal();
        terminal.check_card(example_1);
        terminal.check_card(example_2);
        terminal.check_card(example_3);
        terminal.check_card(example_4);
        terminal.check_card(example_5);
        System.out.println("====================");
        terminal.print_info();
    }
}
