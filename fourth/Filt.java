package fourth;

import java.util.Arrays;

public class Filt {
    public static Object[] filter(Object[] array,Filter filter){
        /*
        Возвращает массив, применяя фильтрацию, указанную в интерфейсе Filter
         */
        int counter = 0;

        for(int i=0;i< array.length;i++){
            if(!filter.apply(array[i])){
                counter+=1;
            }
            else{
                System.out.println(array[i - counter] +"-->" +array[i]);
                array[i - counter] = array[i];

            }
            System.out.println(Arrays.toString(array));
            System.out.println(counter);
        }
        //копирование значения из массива в новый массив с  указанной длинной
        return Arrays.copyOf(array, array.length - counter);
    }
}
