package second.classwork1.collectionwithoutdubl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

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
         System.out.println("*Задание 1*");
         System.out.println("Массив: "+new_array.toString());
         Collection<Integer> my_c = collection.removeDuplicates(new_array);
         System.out.println("Итоговый результат массива: "+my_c.toString());
         //используем метод удаления

         System.out.println("*Задание 3*");
         String my_string = "привет, это я";
         collection.mapping(my_string);
         collection.buildDictionaryWithMap(my_string);



         // 2 задача из collection1. Сравнение ArrayList % LinkedList
         ArrayList<Integer> arrayList = new ArrayList<>();
         LinkedList<Integer> linkedList = new LinkedList<>();
         long startTime1 = System.currentTimeMillis();
         collection.add_to_ArrayList(arrayList);
         //System.out.println(System.currentTimeMillis() - startTime1);
         long time1 = System.currentTimeMillis() - startTime1;
         long startTime2 = System.currentTimeMillis();
         collection.add_to_LinkedList(linkedList);
         long time2 = System.currentTimeMillis() - startTime2;
         System.out.println("*Задание 2*");
         System.out.println("Время добавления элементов ArrayList - "+ time1);
         System.out.println("Время добавления элементов LinkedList - "+ time2);
         System.out.println("Array List использовать эффективнее в "+(time2/time1)+" раз.");
         long startTime3 = System.currentTimeMillis();
         for(int i=0;i<100000; i++){
             collection.randomItemArrayList(arrayList);
         }
         long time3 = System.currentTimeMillis() - startTime3;
         long startTime4 = System.currentTimeMillis();
         for(int i=0;i<100000; i++){
             collection.randomItemLinkedList(linkedList);
         }
         long time4 = System.currentTimeMillis() - startTime4;
         System.out.println("Время извлечения рандомных элементов ArrayList - "+ time3);
         System.out.println("Время извлечения рандомных элементов LinkedList - "+ time4);
         System.out.println("Array List использовать эффективнее в "+(time4/time3)+" раз.");


     }
}
