package second.classwork1.collectionwithoutdubl;

import java.util.*;
public class HelloWorld{

    public static class Util {
        //пример дженерика
        public static <T> T getValue(Object obj, Class<T> clazz) {
            return (T) obj;
        }
        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }

    public static void main(String []args) {
        List list = Arrays.asList("Author", "Book");
        for (Object element : list) {
            String data = Util.getValue(element, String.class);
            System.out.println(data);
            System.out.println(Util.<String>getValue(element));
        }
    }
}