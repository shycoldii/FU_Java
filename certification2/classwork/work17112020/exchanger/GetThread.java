package certification2.classwork.work17112020.exchanger;

import java.util.concurrent.Exchanger;

public class GetThread implements Runnable{
    Exchanger<String> exchanger;
    String message;
    GetThread(Exchanger<String > exchanger){
        this.exchanger = exchanger;
        message = "hello,java";
    }
    @Override
    public void run() {
        try{
            message = exchanger.exchange(message);
            System.out.println("Get Thread: "+message);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
