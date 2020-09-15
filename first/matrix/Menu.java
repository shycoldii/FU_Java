package matrix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    /**
     * Общение с пользователем
     */
    public static double[][] create_matrix(){
        /**
         * Заполнение матрицы пользователем
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число строк матрицы (n)");
        int n = scanner.nextInt();
        System.out.println("Введи число столбцов матрицы (m)");
        int m = scanner.nextInt();
        if (n==0 || m == 0){
            throw new InputMismatchException();
        }
        System.out.println("Заполни матрицу значениями построчно.");
        double[][] matrix = new double[n][m];
        for(int i=0;i<n;i++){
            for (int j=0; j<m;j++){
                matrix[i][j]= scanner.nextDouble();
            }
        }
        return matrix;
    }
    public static void main(String[] args) throws InputMismatchException {
        String status = "o";
        System.out.println("Привет! Выбери, что тебя интересует.");
        try {
            while (status != "q") {
                System.out.println("---------------------------------");
                System.out.println("Транпонированная матрица - d");
                System.out.println("Возведение матрицы в степень - e");
                System.out.println("Умножение матрицы на число - b");
                System.out.println("---------------------------------");
                System.out.println("Умножение двух матриц - c");
                System.out.println("Сложение двух матриц - a1");
                System.out.println("Вычитание двух матриц -a2");
                System.out.println("Выход из меню - q");
                Scanner scanner = new Scanner(System.in);
                String user = scanner.next();
                switch (user) {
                    case "q":
                        status = "q";
                        break;
                    case "a1":
                        System.out.println("Заполни первую матрицу!");
                        double[][] matrixa11 = create_matrix();
                        System.out.println("Заполни вторую матрицу!");
                        double[][] matrixa12 = create_matrix();
                        Matrix matrixa = new Matrix(matrixa11);
                        Matrix matrixa2 = new Matrix(matrixa12);
                        System.out.println("Первая матрица:");
                        matrixa.show_matrix();
                        System.out.println("Вторая  матрица:");
                        matrixa2.show_matrix();
                        Matrix sum = Matrix.add_substract(matrixa,matrixa2,true);
                        if (sum!=null){
                            System.out.println("Итог сложения матриц:");
                            sum.show_matrix();
                        }
                        break;
                    case "a2":
                        System.out.println("Заполни первую матрицу!");
                        double[][] matrixa122 = create_matrix();
                        System.out.println("Заполни вторую матрицу!");
                        double[][] matrixa22 = create_matrix();
                        Matrix matrixx = new Matrix(matrixa122);
                        Matrix matrixxx = new Matrix(matrixa22);
                        System.out.println("Первая матрица:");
                        matrixx.show_matrix();
                        System.out.println("Вторая  матрица:");
                        matrixxx.show_matrix();
                        Matrix sub = Matrix.add_substract(matrixx,matrixxx,false);
                        if (sub!=null){
                            System.out.println("Итог вычитания матриц:");
                            sub.show_matrix();
                        }
                        break;
                    case "b":
                        System.out.println("Введи число, на которое хочешь умножить:");
                        double num = scanner.nextDouble();
                        double[][] matrixb = create_matrix();
                        Matrix nmatrix = new Matrix(matrixb);
                        nmatrix.show_matrix();
                        nmatrix = nmatrix.num_matrix(nmatrix,num);
                        nmatrix.show_matrix();
                        break;
                    case "c":
                        System.out.println("Заполни первую матрицу!");
                        double[][] matrix1 = create_matrix();
                        System.out.println("Заполни вторую матрицу!");
                        double[][] matrix2 = create_matrix();
                        Matrix mmatrix1 = new Matrix(matrix1);
                        Matrix mmatrix2 = new Matrix(matrix2);
                        System.out.println("Первая матрица:");
                        mmatrix1.show_matrix();
                        System.out.println("Вторая матрица:");
                        mmatrix2.show_matrix();
                        Matrix result = Matrix.multiply(mmatrix1,mmatrix2);
                        if (result!=null){
                            System.out.println("Итог умножения матриц:");
                            result.show_matrix();
                        }
                        break;
                    case "d":
                        double[][] matrixd = create_matrix();
                        Matrix tmatrix = new Matrix(matrixd);
                        tmatrix.show_matrix();
                        tmatrix = tmatrix.tmatrix();
                        tmatrix.show_matrix();
                        break;
                    case "e":
                        System.out.println("Введи  степень матрицы:");
                        int degree = scanner.nextInt();
                        double[][] matrixe = create_matrix();
                        Matrix dmatrix = new Matrix(matrixe);
                        Matrix matrix = new Matrix(matrixe);
                        dmatrix.show_matrix();
                        for(int i =0; i<degree-1; i++){
                            if (i==0){
                                dmatrix = Matrix.multiply(matrix,matrix);
                            }
                            if (i>0){
                                dmatrix = Matrix.multiply(dmatrix,matrix);
                            }

                        }
                        System.out.println("Итог возведения матрицы в данную степень:");
                        dmatrix.show_matrix();
                    default:
                        status = "q";
                        break;

                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Введи корректно!");
        }
    }
}
