package certification2.classwork.work17112020;

public class task1 extends Thread{
    private Object object;
    task1(String name,Object object){
        super(name);
        this.object = object;
    }

    public void run(){
        for(int i=1;i<6;i++){
            object.add();
            object.show();
            System.out.println(getState());
        }
    }
}
