package fourth;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String array[] = new String[]{"One",null, "Two", "5", null};
        String[] newarray = (String[]) Filt.filter(array, new Filter(){
            @Override
            public boolean apply(Object o) {
                return o == null;
            }
        });
        System.out.println(Arrays.toString(newarray));
    }
}
