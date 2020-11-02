package preparing_work.second_task;

public class One_pay_Card extends Card{
    private int balance;
    private int number_of_trips;
    private int type;

    public One_pay_Card(int type, int balance, int number_of_trips){
        this.balance = balance;
        this.number_of_trips = number_of_trips;
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public int getNumber_of_trips() {
        return number_of_trips;
    }

    public void setBalance(int balance) {
        this.balance = this.balance+balance;
    }

    public void setNumber_of_trips(int number_of_trips) {
        this.number_of_trips = this.number_of_trips+number_of_trips;
    }

    @Override
    public int check_status() {
        if (this.number_of_trips >=1){
            decrease();
            return 10;
        }
        if (this.balance >= 35){
            decrease(35);
            return 11;
        }
        return 0;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public int getInfo() {
        System.out.println("Информация: "+getNumber_of_trips()+" поездок,  "+getBalance()+" рублей.");
        if (getNumber_of_trips()!=0){
            return getNumber_of_trips();
        }
        return getBalance();
    }

    @Override
    public void increase() {

    }

    @Override
    public void increase(int type,int money) {
          if(type==1){
              setNumber_of_trips(money);
          }
          if(type==2){
              setBalance(money);
          }
    }

    @Override
    public void decrease() {
        setNumber_of_trips(-1);
    }

    @Override
    public void decrease(int money) {
        setBalance(-money);
    }
}
