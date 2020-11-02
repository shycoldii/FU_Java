package preparing_work.second_task;

public abstract class Card {
    public abstract int  check_status();
    public abstract int getType();
    public abstract int getInfo();
    public abstract void increase();
    public abstract void increase(int i, int i1);
    public abstract void decrease();
    public abstract void decrease(int i1);
}
