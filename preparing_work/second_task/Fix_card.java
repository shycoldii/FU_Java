package preparing_work.second_task;

public  class Fix_card extends Card {
    /**
     * Наследник класса карты с реализацией своих методов (социальная карта)
     */
    private int type;
    private boolean status;

    public Fix_card(int type, boolean status){
        //Тип - 1..3 в зависимости от тарифа, статус - активна/нет
         this.type = type;
         this.status = status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public int getType() {
        return type;
    }

    @Override
    public int getInfo() {
        if (check_status() == 1){
            System.out.println("Информация: активна");
            return 1;
        }
        else{
            System.out.println("Информация: неактивна");
            return 0;
        }
    }

    @Override
    public void increase() {
        //повышение статуса на "активна" при оплате
          setStatus(true);
    }

    @Override
    public void increase(int i, int i1) {

    }

    @Override
    public void decrease() {

    }

    @Override
    public void decrease(int i1) {

    }


    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int check_status() {
        if (status){
            return 1;
        }
        return 0;
    }
}
