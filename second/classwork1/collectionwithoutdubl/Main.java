package second.classwork1.collectionwithoutdubl;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
     public static void main(String[] args){
         ArrayList<Integer> intlist = new ArrayList<>();
         ArrayList<Character> charlist =  new ArrayList<>();

         ArrayList<Integer> new_array = new ArrayList<>(); //создание массива
         for (int i =0;i<22; i++){
             new_array.add(1);
         }
         // removeAll удаляет ВСЕ вхождения из переданной коллекции
         //intlist.removeAll(new_array);
         //System.out.println(intlist.size());
         intlist.addAll(new_array);
         System.out.println("Массив: "+new_array.toString());
         Collection<Integer> my_c = collection.removeDuplicates(new_array);
         System.out.println("Итоговый результат массива: "+my_c.toString());
         //используем метод удаления

         String my_string = "привет";
         collection.mapping(my_string);
         collection.buildDictionaryWithMap(my_string);
     }
}
