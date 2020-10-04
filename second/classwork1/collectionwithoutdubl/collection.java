package second.classwork1.collectionwithoutdubl;
import java.util.*;

public class collection {
    public static <T>Collection<T> removeDuplicates(Collection<T> coll){
        /**
         * Возвращает коллекцию без дубликатов
         */
        //T- любой тип данных
        return new HashSet<>(coll);
    }

    public static  void mapping(String text){
        /**
         * Функция, возвращающая количество вхождений символов в слово. Используется счетчик индекса массива
         */
        text = text.toLowerCase();
        int[] result = new int['я'-'a'+1];
        //System.out.println(Arrays.toString(result));
        //System.out.println(result.length);
        //System.out.println((int) 'а');
        for(int i=0; i< text.length(); i++){
            char ch = text.charAt(i); //символ по индексу
            if (ch >= 'a' && ch<='я'){
                result[ch-'а']++;
            }
        }
        //for (int i=0; i< 32;i++){
           // System.out.println((char)(i+'а')+" = "+result[i]);
        //}

    }

    public static void buildDictionaryWithMap(String text){
        /**
         * Более элегантный способ прошлого метода с использованием словаря
         */
        text=text.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if ((ch >='a' && ch<='я')|| ch == 'ё'){
                map.compute(ch,((character, integer) -> integer == null ? 1 : integer+1));
                //вставляем ключ ch в map  и значения integer
            }
        }
        ArrayList<Map.Entry<Character, Integer>> entr = new ArrayList<>(map.entrySet()); // Map.Entry-поле с ключом-значением
        entr.sort(((o1, o2) -> Character.compare(o1.getKey(), o2.getKey())));
        for (Map.Entry<Character, Integer> enter: entr){
            System.out.println(enter.getKey()+" = "+enter.getValue());
        }
    }
    public static <K,V> Map <V,Collection<K>> revertMap(Map<? extends K, ? extends V> map){
        /**
         * Меняет ключ и значение местами
         */
        Map<V,Collection<K>> resultMap = new HashMap<>(); // создаем новый словарь

        Set<K> keys = (Set<K>) map.keySet();
        for (K key: keys){
            V value = map.get(key); //получаем значение
            resultMap.compute(value,(v,ks) -> { //вставляем как ключ
                if(ks == null){
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }
        return resultMap;
    }
    public static ArrayList<Integer> add_to_ArrayList(ArrayList<Integer> list){
      for(int i=0; i<1000000; i++){
          list.add((int) (Math.random()*100));
      }
      //System.out.println(list.toString());
      return list;
    }
    public static LinkedList<Integer> add_to_LinkedList(LinkedList<Integer> list){
        for(int i=0; i<1000000; i++){
            list.add((int) (Math.random()*100));
        }
        //System.out.println(list.toString());
        return list;
    }
    public static int randomItemArrayList(ArrayList<Integer> mylist) {
        Random rand = new Random();
        Integer randomInt = mylist.get(rand.nextInt(mylist.size()));
        return randomInt;
    }
    public static int randomItemLinkedList(LinkedList<Integer> mylist) {
        Random rand = new Random();
        Integer randomInt = mylist.get(rand.nextInt(mylist.size()));
        return randomInt;
    }
    }

