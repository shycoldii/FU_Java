package second.classwork1;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class collectionwithout {
    public static <T>Collection<T> removeDuplicates(Collection<T> coll){
        //T- любой тип данных
        return new HashSet<>(coll);
    }
    public static  void mapping(String text){
        text = text.toLowerCase();
        int[] result = new int['я'-'a'+1];
        for(int i=0; i< text.length(); i++){
            char ch = text.charAt(i); //символ по индексу
            if (ch >= 'a' && ch<='я'){
                result[ch-'а']++;
            }
        }
        for (int i=0; i< 32;i++){
            System.out.println((char)(i+'а')+" = "+result[i]);
        }

    }

    public static void buildDictionaryWithMap(String text){
        text=text.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if ((ch >='a' && ch<='я')|| ch == 'ё'){
                map.compute(ch,((character, integer) -> integer == null ? 1 : integer+1));
            }
        }
    }

    public static void change(String text){
        text=text.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if ((ch >='a' && ch<='я')|| ch == 'ё'){
                map.compute(ch,((character, integer) -> integer == null ? 1 : integer+1));
            }
        }
        Map<Character, Integer> map1= new HashMap<>();
        for(int i=0;i<map.size();i++){
            map1.put((char)map.get(i),i)
        }
    }
}
