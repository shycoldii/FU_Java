package certification2.classwork.work17112020.Task2;

public class Main {
    public static void main(String[] args) {
           Object obj = new Object();
           new SyncThread(obj).start();
           new SyncThread(obj).start();
    }
}
