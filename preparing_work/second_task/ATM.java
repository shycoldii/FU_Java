package preparing_work.second_task;


public class ATM extends Payment{
    /**
     * Реализация класса Банкомата, принимающего карту на вход
     */
    private Card card;
    private final int atm_id = 1;
    ATM(Card card){
        this.card = card;
    }

    @Override
    public void top_up_card() throws InterruptedException {
        System.out.println("*Пополнение с банкомата*");
        Money_processing.process(card,atm_id);
    }

    @Override
    public void check_card() throws InterruptedException {
        Money_processing.info(card,atm_id);

    }

}

