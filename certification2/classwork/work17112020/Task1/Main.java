package certification2.classwork.work17112020.Task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Thread thread = new Thread(){
            @Override
            public void run(){
                System.out.println(getState());
                try{
                    synchronized (object){
                        object.notifyAll();
                        object.wait(3000);
                    }
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        synchronized (object){
            System.out.println(thread.getState());
            thread.start();
            object.wait();
            System.out.println(thread.getState());
            object.notifyAll();
            System.out.println(thread.getState());
        }
        try{
            thread.join();
        }
        catch(InterruptedException e){};
        System.out.println(thread.getState());

    }
}
