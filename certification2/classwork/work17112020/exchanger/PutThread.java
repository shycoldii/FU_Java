package certification2.classwork.work17112020.exchanger;

import java.util.concurrent.Exchanger;

public class PutThread implements Runnable{
    Exchanger<String> exchanger;
    String message;
    PutThread(Exchanger<String > exchanger){
        this.exchanger = exchanger;
        message = "hello,world";
    }
    @Override
    public void run() {
        try{
            message = exchanger.exchange(message);
            System.out.println("Put Thread: "+message);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
