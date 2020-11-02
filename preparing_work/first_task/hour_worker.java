package preparing_work.first_task;

public class hour_worker extends worker {
    /**
     *
     * @param id - уникальный номер работника
     * @param name -имя работника
     * @param per_hour - количество часов
     */

    public hour_worker(int id, String name, int per_hour){
        super(id, name,per_hour);
    }

    @Override
    public double calculate_salary() {
        return 20.8*8*this.num;
    }
}
