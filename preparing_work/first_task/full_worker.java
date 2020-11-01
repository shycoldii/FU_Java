package preparing_work.first_task;

public class full_worker extends worker {

    public full_worker(int id, String name,int num){
        super(id, name,num);
    }

    @Override
    public double calculate_salary() {
        return num;
    }
}
