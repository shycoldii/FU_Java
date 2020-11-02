package preparing_work.second_task;

public abstract class Payment {
    /**
     *
     * Абстрактный класс для платежей телефона и банкомата
     */
    public abstract void top_up_card() throws InterruptedException;
    public abstract void check_card() throws InterruptedException;
}
