package abs_figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Pyramid pyramid = new Pyramid(101, 101);
        //Ball ball = new Ball(5);
        //Cylinder cylinder = new Cylinder(2,3);
        Box box = new Box(1000);
        Scanner scanner = new Scanner(System.in);
        boolean r = true;
        int z = 0;

        while (true){
            z+=1;
            System.out.println("Введите тип фигуры: шар, пирамида или цилиндр.");
            String state = scanner.next();
            switch (state){
                case "шар":
                    System.out.println("Введите радиус.");
                    double radius = scanner.nextDouble();
                    Ball ball = new Ball(radius);
                    r =  box.add(ball);
                    break;
                case "пирамида":
                    System.out.println("Введите площадь.");
                    double s = scanner.nextDouble();
                    System.out.println("Введите высоту.");
                    double h = scanner.nextDouble();
                    Pyramid pyramid = new Pyramid(s, h);
                    r =  box.add(pyramid);
                    break;
                case "цилиндр":
                    System.out.println("Введите радиус.");
                    radius = scanner.nextDouble();
                    System.out.println("Введите высоту.");
                    h = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(radius, h);
                    r =  box.add(cylinder);
                    break;
                default:
                    break;

            }
            if (!r){
                System.out.println("Переполнение во время объекта №"+z);
                break;
            }

        }

    }
}
