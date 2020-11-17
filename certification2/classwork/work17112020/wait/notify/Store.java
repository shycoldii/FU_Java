package certification2.classwork.work17112020.wait.notify;

public class Store {
    int product = 0;
    public synchronized void get(){
        while(product <1){
            try{
                wait();
            }
            catch(InterruptedException e){

            }
        }
        product--;
        System.out.println("Клиент купил товар!");
        System.out.printf("Товара на складе %d \n",product);
        notify(); //продолжает работу предыдущего потока
    }
    public synchronized void put(){
        while(product >=3){
            try{
                wait();
            }
            catch (InterruptedException e){

            }
        }
        product++;
        System.out.println("Был добавлен один товар!");
        System.out.printf("Товара на складе %d \n",product);
        notify();//продолжает работу предыдущего потока
    }
}
