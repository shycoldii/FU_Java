package certification2.classwork.work17112020.exchanger;

import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        Exchanger<String> exc = new Exchanger<>();
        new Thread(new PutThread(exc)).start();
        new Thread(new GetThread(exc)).start();
    }
}
