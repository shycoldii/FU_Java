package com.company;

public class task_4 {
    public static void main(){
        int a = 5;
        int b = 6;
        int c = a;
        a = b;
        b = c;
        System.out.println(a+" "+b);

        // 2 способ
         a = 5;
         b = 6;
         a = a + b - (b=a);
        System.out.println(a+" "+b);
    }
}
