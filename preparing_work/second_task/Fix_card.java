package preparing_work.second_task;

public  class Fix_card extends Card {
    private int type;
    private boolean status;

    public Fix_card(int type, boolean status){
         this.type = type;
         this.status = status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean check_status() {
        return status;
    }
}
