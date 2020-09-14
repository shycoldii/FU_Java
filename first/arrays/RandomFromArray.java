package arrays;

public class RandomFromArray {
       private int[] new_array;

       public RandomFromArray(int[] values, int[] weights){
           int summ = 0;
           for (int i: weights){
               summ+=i;
           }
           new_array = new int[summ];
           int r = 0;
           System.out.print("Массив был создан: ");
           for(int i =0; i< weights.length; i++){
               for(int j=0; j< weights[i]; j++){
                   new_array[r] = values[i];
                   System.out.print(new_array[r]+" ");
                   r+=1;

               }
           }
       }
       public int getRandom(){
           double random =  (Math.random() * ( new_array.length - 1));
           System.out.println();
           System.out.println("Выбранное значение: "+new_array[(int) random]);
           return new_array[(int) random];
       }

}
