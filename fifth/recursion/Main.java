package fifth.recursion;

import java.util.Arrays;

public class Main {
    public static String recursion_1(int num){
        //задание 1
        if (num == 1){
            return "1";
        }
        else{
            return recursion_1(num-1)+" "+num;
        }
    }
    public static double[] get_random_array(int size){
        //генерация массивов для 2 задания
        double[] array = new double[size];
        for(int i=0;i<size;i++){
            array[i] = Math.random();
        }
        return array;
    }

      public static void main(String[] args){
        System.out.println("Первое задание");
          System.out.println(recursion_1(80));
          System.out.println("Второе задание");
          double[] test = get_random_array(100000000);
          Arrays.sort(test);
          long startTime = System.nanoTime();
          System.out.println(force_binary.brute_force(test,1));
          double res1 = ((double)(System.nanoTime()-startTime)/1_000_000_000);
          System.out.println("Времени затрачено на перебор: "+res1);

          startTime = System.nanoTime();
          System.out.println(force_binary.binarySearchRecursively(test,1,0,test.length));
          double res2 = ((double)(System.nanoTime()-startTime)/1_000_000_000);
          System.out.println("Времени затрачено на двоичный поиск: "+res2);
          System.out.println("Насколько быстрее  перебор - "+(res1-res2));

          System.out.println("Третье задание");

          System.out.println("Четвертое задание");

      }

}
