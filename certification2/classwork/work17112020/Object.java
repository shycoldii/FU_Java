package certification2.classwork.work17112020;

public class Object {
    private int check = 0;

    public synchronized  void add(){
        if(check > 5){
            try{
                wait();
            }
            catch (InterruptedException e){}

        }
        check++;
        notifyAll();
    }
    public  synchronized  void show(){
        System.out.println(check);
    }
}
