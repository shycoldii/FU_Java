package certification2.classwork.work17112020.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2);
        for(int i=1;i<9;i++)
            new Philosopher(sem,i).start();
    }
}
