package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[5]; // задаем массив размерностью 5
        int nums1[] = new int[5]; // задаем массив размерностью 5
        int nums2[] = {1, 2, 3, 4, 5}; //создание массива размерностью 5
        int[][] twoD = new int[5][4];
        int[][] twoD2 = new int[3][];
        for (int i = 0; i < 3; i++) {
            twoD2[i] = new int[i + 1];
        }
        int[][] twoD3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
        for (int i = 0; i < twoD3.length; i++) {
            for (int j = 0; j < twoD3[i].length; j++) {
                System.out.print(twoD3[i][j]);
            }
            System.out.println();
        }
        int counter = 0;
        while ( counter < 5) {
            System.out.println(counter++);
        }
        do {
            System.out.println(counter); // зашел и 1 раз прогнал, хотя условие уже ложное
        } while ( counter > 5);
        // || - упрощенное or , $$ - упрощенное and, ^ - исключающее или
        String a = "Ноябрь";
        switch(a){
            case "Сентябрь":
            case "Ноябрь":
                System.out.println("Ноябрь!");
                break;
            case "Октябрь":
                System.out.println("Осень!");
                break;

            default:
                System.out.println("Не осень!");
        }
        counter = 0;
        boolean done = false;
        for(int i = 0; !done; i++){
            if(i==10){
                done = true;
            }
            System.out.println(i);
        }

        for (int i: nums){
            System.out.println(i);
        }
        int y =5;
        int x = (y==5)?2:3;
        int z  = (y==6)?2:3;
        System.out.println(z); //тернарный оператор

        // ООП

        Car my = new Car("yellow",245,"X6");
        System.out.println(my.getModel());
        System.out.println(my.speedInMiles());
        System.out.println(my.speedInMiles(true));
        System.out.println(my.hello("100"));

        // 1 задание
        System.out.println("Задание 1");
        task_1 z_1 = new task_1();
        z_1.Hello();
        
        // 2 задание
        System.out.println("Задание 2");
        task_2 z_2 = new task_2();
        z_2.main();

        // 3 задание
        System.out.println("Задание 3");
        task_3 z_3 = new task_3();
        z_3.main();

        // 4 задание
        System.out.println("Задание 4");
        task_4 z_4 = new task_4();
        z_4.main();

        // 5 задание
        System.out.println("Задание 5");
        task_5 z_5 = new task_5();
        z_5.main(3,4);

        // 6 задание
        System.out.println("Задание 6");
        task_6 z_6 = new task_6();
        z_6.main();

        // 7 задание
        System.out.println("Задание 7");
        task_7 z_7 = new task_7();
        z_7.main();

        // 8 задание
        System.out.println("Задание 8");
        task_8 z_8 = new task_8();
        z_8.main();

        // 9 задание
        System.out.println("Задание 9");
        task_9 z_9 = new task_9();
        z_9.main(6);
        z_9.main(8);
        z_9.main(200);

        // 10 задание
        System.out.println("Задание 10");
        task_10 z_10 = new task_10();
        z_10.main(3,4);

        // 11 задание
        System.out.println("Задание 11");
        task_11 z_11 = new task_11();
        z_11.main(3,4);

        // 12 задание
        System.out.println("Задание 12");
        task_12 z_12 = new task_12();
        z_12.main(0.2,4.2,3.5,4.5);
    }

}
