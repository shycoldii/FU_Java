package vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double x1 = 1.5;
        double y1 = 2;
        double z1 = 3;
        double x2 = 4.5;
        double y2 = 4;
        double z2 = 6;

        Scanner scanner = new Scanner(System.in);
        //double test = scanner.nextDouble();

        Vector first_vector = new Vector(x1,y1,z1);
        double lenght_v1 = first_vector.lenghtVector();
        System.out.println("b) Длина вектора равна: "+ lenght_v1);

        Vector second_vector = new Vector(x2,y2,z2);
        double scalar = Vector.scalar_vectors(first_vector,second_vector);
        double lenght_v2= second_vector.lenghtVector();
        System.out.println("c) Скалярное произведение двух векторов равно: "+ scalar);

        Vector.standart_actions(first_vector,second_vector,3);

        String cosinus = Double.toString(scalar/(lenght_v1*lenght_v2));
        System.out.println("e) Косинус угла равен: "+cosinus);

        Vector.standart_actions(first_vector,second_vector,1);
        Vector.standart_actions(first_vector,second_vector,2);

        System.out.println("g) Введите размер вашего массива:");
        int n = scanner.nextInt();
        Vector[] vectors  = Vector.vectors(n);
        System.out.println("Вывести содержимое массива? press y");
        String s = scanner.next();
        if (s.equals("y"))
        {
            Vector.print_vectors(vectors);
        }


    }
}
