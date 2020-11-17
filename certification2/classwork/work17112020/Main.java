package certification2.classwork.work17112020;

public class Main {
    public static void main(String[] args){
        //Thread t = Thread.currentThread();
        //System.out.println(t.getName());
        //System.out.println(t.getPriority());
        //t.isAlive();
        //t.start();

        //System.out.println("New Thread,,,");
        //new NewThread("Thread1").start();
        //System.out.println("Finished");"""

        //for(int i=0; i<10;i++){
        //    new NewThread("Thread"+i).start();

        //}
        //System.out.println("Finished");
        //System.out.println("Main Thread is started");
       // NewThread nt  =new NewThread("thread1");
        //nt.start();
        //try{

        //    nt.interrupt();
        //    Thread.sleep(200);
       // }
        //catch(InterruptedException e){
        //    System.out.println("Main Thread is interrupted");
        //}
        //CommonResource res = new CommonResource();
        //for(int i=1;i<5;i++){
        //    Thread t = new Thread(new CountThread(res),"thread"+i);
        //    t.start();
       // }
        //System.out.println("Main Thread is Finished");

        System.out.println("Task 1");
        Object object = new Object();

        task1 t = new task1("Thread 1",object);

        System.out.println(t.getState());

        t.start();
        System.out.println(t.getState());

        t.run();
        System.out.println(t.getState());

        t.interrupt();
        System.out.println(t.getState());
    }

}
