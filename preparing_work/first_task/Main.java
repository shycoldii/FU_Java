package preparing_work.first_task;

import java.io.*;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) throws IOException {
        boolean mode = false; //определяет режим работы (чтение или запись)

        ArrayList<worker> list = new ArrayList<>();

        if(mode){
            //чтение файла
             list = Main.read_file("data.txt");
        }
        else{
            //задаем свои данные
            list.add(new hour_worker(1, "Petrov", 120));
            list.add(new full_worker(2, "Ivanov", 20000));
            list.add(new full_worker(3, "Alexandrov", 20000));
            list.add(new full_worker(4, "Kedr", 30000));
            list.add(new full_worker(5, "Welwet", 80000));
        }

        if(list.size() != 0){
            list.sort(Comparator.comparing(worker::calculate_salary, Collections.reverseOrder()).thenComparing(worker::getName));
            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i).getName());
            }
            for (int i = list.size() - 1; i > list.size() - 4; i--) {
                System.out.println(list.get(i).getName());
            }
            Main.print_list(list);
            Main.write_file(list);
        }
        else{
            System.out.println("Файл не прочтен!");
        }


    }

    public static void print_list(ArrayList<worker> list) {
        //вывод списка на экран
        for (worker i : list) {
            System.out.println(i.getId() + " " + i.getName() + " " + (int)i.getNum()+" "+ i.calculate_salary());
        }
    }

    public static void write_file(ArrayList<worker> list) throws IOException {
        //запись в файл
        FileWriter writer = new FileWriter("data.txt");
        for (worker i : list) {
            writer.write(i.getId() + " " + i.getName() + " " + (int)i.getNum() + "\n");
        }
        writer.flush();
    }

    public static ArrayList<worker> read_file(String path){
        //чтение файла
        ArrayList<worker> list = new ArrayList<>();
        HashSet<Integer> id_list = new HashSet<>();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                int id = Integer.parseInt(line.split(" ")[0]);
                if(id_list.contains(id)){
                    id+=1;
                }
                System.out.print(id_list.toString());
                String name = line.split(" ")[1];

                if(name.length() == 0){
                    throw new Exception();
                }
                int status = Integer.parseInt(line.split(" ")[2]);
                if(status<5000){
                    System.out.print("hour worker!");
                    list.add(new hour_worker(id,name,status));
                }
                else{
                    System.out.print("full worker!");
                    list.add(new full_worker(id,name,status));
                }
                line = reader.readLine();
            }
            return list;

        }
       catch (IOException ex){
          System.out.print("Ошибка чтения.");
          return list;
        }
        catch (Exception ex){
            System.out.print("Ошибка общего назначения. Проверьте свои данные.");
            return list;
        }
    }


}
