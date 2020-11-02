package preparing_work.second_task;

public class Info {
    public static void info(){
        System.out.println("=======================");
        System.out.println("Школьная карта: 300");
        System.out.println("Студенческая карта: 400");
        System.out.println("Социальная карта: 350 ");
        System.out.println("Поездка на тройке: 35");
        System.out.println("=======================");
    }
    public static int get_price(int type){
        if (type==1){
            return 300;
        }
        else if(type==2){
            return 400;
        }
        else if(type==3){
            return 350;
        }
        else if(type==4){
            return 35;
        }
        return 0;
    }
}
