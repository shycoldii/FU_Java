package preparing_work.second_task;

public class Terminal {
    /**
     * С помощью данного класса происходит вся терминальная проверка и вывод на экран статистики
     */
    private int num_one;
    private int income;

    private int true_passage;
    private int false_passage;

    public boolean check_card(Card card){
        // проверяем вход
        int type = card.getType();
        int check = card.check_status();
        if(check == 1 || check == 10 || check == 11){
            if(type==4){
                if (check==10){
                    this.num_one+=1;
                }
                else{
                    this.income+=35;
                }
            }
            this.true_passage+=1;
            System.out.println("Проходите!");
            return true;
        }
        else{
            this.false_passage+=1;
            System.out.println("Операция невозможна.");
            return false;
        }
    }
    public  void print_info(){
         //Печатаем статистику на экран
         System.out.println("====================");
         System.out.println("Успешная проходимость: "+this.true_passage);
         System.out.println("Неуспешная проходимость: "+this.false_passage);
         System.out.println("Количество билетов: "+this.num_one);
         System.out.println("Прибыль: "+this.income);
         System.out.println("====================");
    }

}
