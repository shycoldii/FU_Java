package certification2.classwork.work17112020.semaphore;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread{
    Semaphore sem;
    int num = 0;
    int id;

    Philosopher(Semaphore sem, int id)
    {
        this.sem=sem;
        this.id=id;
    }
    public void run()
    {
        try
        {
            while(num<3)
            {
                sem.acquire();
                System.out.println ("Философ " + id+" за столом");
                // философ ест
                sleep(300);
                num++;

                System.out.println ("Философ " + id+" покинул стол");
                sem.release();
                sleep(300);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("у философа " + id + " проблемы со здоровьем");
        }
    }
}
