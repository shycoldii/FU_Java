package fourth.titactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    char[][] table;
    Random random;
    Scanner scanner;

    final char X = 'x';
    final char O = 'o';
    final char E = '.';
    
    TicTacToe(){
        /**
         * Конструктор класса
         */
      this.table = new char[3][3];
      this.random = new Random();
      this.scanner = new Scanner(System.in);
    }

    void NewTable() {
        /**
         * Заполняем поле пустыми клетками
         */
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                table[row][col] = E;

    }
    void printTable() {
        /**
         * Печать поля
         */
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
    }
    void Turn(char key,int ask) {
        /**
         * Ход, где ask - переменная, определяющая лицо хода
         */
        int x, y;
        if (ask==1){
            do {
                System.out.println("Введите координаты клетки:");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } while (!isValid(x, y));
        }
        else{
            do {
                x = random.nextInt(3);
                y = random.nextInt(3);
            } while (!isValid(x, y));

        }
        table[y][x] = key;
        }

    boolean isValid(int x, int y) {
        /**
         * Проверка ввода клетки
         */
        if (x < 0 || y < 0 || x >= 3|| y >= 3)
            return false;
        return table[y][x] == E;
    }
    boolean isFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (table[row][col] ==E)
                    return false;
        return true;
    }
    boolean check(char dot) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == dot && table[i][1] == dot &&
                    table[i][2] == dot) ||
                    (table[0][i] == dot && table[1][i] == dot &&
                            table[2][i] == dot))
                return true;
        if ((table[0][0] == dot && table[1][1] == dot &&
                table[2][2] == dot) ||
                (table[2][0] == dot && table[1][1] == dot &&
                        table[0][2] == dot))
            return true;
        return false;
    }
    boolean Start(int x) {
        /**
         * Проверка ввода переменной
         */
        if (x ==0 || x==1)
            return true;
        else{
            return false;
        }
    }
    public void game(){
        char you;
        int ask;
        char bot;

        System.out.println("Добро пожаловать в крестики-нолики.");
        System.out.println("Кем вы хотите играть? Введите 1, если за крестики, а 0 - если за нолики.");
        do{
            ask  = scanner.nextInt();
        }
        while(!Start(ask));

        if (ask==1){
            you = 'x';
            bot = 'o';
        }
        else{
            you = 'o';
            bot = 'x';
        }
        NewTable();
        printTable();

        while(true){
            Turn(you,1);
            if (check(you)) {
                System.out.println("ПОБЕДА!");
                break;
            }
            if (isFull()) {
                System.out.println("ПОЛЕ ЗАПОЛНЕНО!");
                break;
            }
            Turn(bot,0);
            printTable();
            if (check(bot)) {
                System.out.println("ПРОИГРЫШ!");
                break;
            }
            if (isFull()) {
                System.out.println("ПОЛЕ ЗАПОЛНЕНО!");
                break;
            }
        }
        System.out.println("ИГРА ОКОНЧЕНА!");
        printTable();
    }
        }


