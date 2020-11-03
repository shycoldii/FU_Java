package control_work_2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Order {
    private int table;
    private Map<Map<Food,Integer>, Boolean> order;
    public Order(int table, Map<Map<Food,Integer>, Boolean> order){
         this.table = table;
         this.order = order;
    }
    public void check_info(){
        System.out.println("========================");
        for(Map<Food,Integer> i: order.keySet()){
            for(Food j: i.keySet()){
                 System.out.println(j.getName().toString()+" : "+j.getPrice()+" : "+i.get(j)+" ");
             }
             System.out.println("========================");
        }
    }
   public void change_status(String food){
       for(Map<Food,Integer> i: order.keySet()){
           for(Food j: i.keySet()){
               if(j.getName().equals(food)){
                   order.put(i,true);
               }
           }
       }
   }
    public void change_status_for_all() throws InterruptedException {
        int sec = 0;
        for( Map<Food, Integer> i: order.keySet()){
            for(Food j: i.keySet()){
                sec+=i.get(j);
                order.replace(i,true);
            }

            TimeUnit.SECONDS.sleep(5*sec);
            System.out.println("Позиция готова...");
            sec = 0;
        }
    }
    public int getPrice(){
        int c=0;
        System.out.println("Печатаем чек...");
        System.out.println("--------------ВАШ СЧЕТ---------------");
        for(Map<Food,Integer> i: order.keySet()){
            for(Food j: i.keySet()){
                System.out.println(j.getName()+" -------------------- "+j.getPrice()+"|"+i.get(j)+"|");
                c+=j.getPrice()*i.get(j);
            }
        }
        System.out.println("ИТОГО: "+ c);
        System.out.println("-------------------------------------");
        return c;
    }

}
