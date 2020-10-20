package fourth;

import java.util.Arrays;
import java.util.function.Function;

public class Filt2 {
    public static <T> T[] fill(T[] array, Function<Integer,? extends T> function){
        for(int i=0;i< array.length;i++) {
            array[i] = function.apply(i);
        }
        return Arrays.copyOf(array,array.length);
    }
}
