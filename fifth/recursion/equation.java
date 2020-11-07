package fifth.recursion;

public class equation {
    public static double func(double x){
        return 200 * x - 23;
    }
    public static void print_func(){
        System.out.println("Уравнение вида: 200 * x - 23");
    }
    public static double  decision(double start, double end){
        //Метод основан на том, что при рассмотрении отрезка нам надо, чтобы на концах
        //отрезка у нас были разные знаки  (так как ищем ноль). Так как задана точность, то выйдем из цикла,
        //когда она достигнет этой точности (0.001)
        double x = start + (end - start) / 2; //делим отрезок пополам
        if(end - start <= 0.001){ //точность
            return start;
        }
        if(func(start) * func(x) > 0){ //смотрим правее
            return decision(x, end);
        } else {
            //смотрим левее
            return decision(start, x);
        }
    }
}
