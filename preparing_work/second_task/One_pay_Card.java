package preparing_work.second_task;

public class One_pay_Card extends Card{
    private int balance;
    private int number_of_trips;

    public One_pay_Card(int balance, int number_of_trips){
        this.balance = balance;
        this.number_of_trips = number_of_trips;
    }

    public int getBalance() {
        return balance;
    }

    public int getNumber_of_trips() {
        return number_of_trips;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setNumber_of_trips(int number_of_trips) {
        this.number_of_trips = number_of_trips;
    }

    @Override
    public boolean check_status() {
        return this.balance > 0 || this.number_of_trips >= 1;
    }
}
