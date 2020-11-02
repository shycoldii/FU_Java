package preparing_work.first_task;

public  abstract class worker{
    /**
     * Абстрактный класс родителя-работника с заданием основных методов и конструктора(объединяет данные)
     */
    private int id;
    private String name;
    double num;

    public worker(int id, String name,double num){
        this.id =id;
        this.name = name;
        this.num = num;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getNum(){
        return num;
    }
    public abstract  double calculate_salary();
}
