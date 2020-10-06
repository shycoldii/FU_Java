package second.collections2;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String args[]){
        System.out.println("*ЗАДАНИЕ 1*");
        System.out.println("Изначальный массив:");
        Integer[][] matrix = {{1,2,3},{3,2}};
        for(Integer[] i: matrix){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Вывод на экран:");
        Iterator<Integer> iterator = new MatrixIterator<>(matrix);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*ЗАДАНИЕ 2*");

    }
}
