package control_work_2;

import java.util.ArrayList;

public class Tables {
    static ArrayList<Integer> system = new ArrayList<>();

    public ArrayList<Integer> getSystem(){
        return system;
    }
    public void fill_system(){
        for (int i = 1;i < 10; i++){
            system.add(i);
        }
    }
    public void get_info(){
        System.out.println("===============");
        for(Integer i: system){
            if(i!=0){
                System.out.println("Свободно: "+i);
            }
            else{
                System.out.println("Занято: "+i);
            }
        }
        System.out.println("===============");
    }
    public boolean check_table(int i){
        return Tables.system.get(i-1) !=0;
    }

    public  void setoff(int i) {
        Tables.system.set(i-1,0);
    }
    public void seton(int i) {
        Tables.system.set(i-1,i);
    }
    public void print_table(){
        System.out.println(system.toString());
    }

}
