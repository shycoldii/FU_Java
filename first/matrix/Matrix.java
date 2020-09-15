package matrix;

import com.sun.xml.internal.bind.v2.model.core.NonElement;

import java.util.Arrays;



public class Matrix {
    private double[][] matrix;
    private int n;
    private int m;

    public Matrix(double[][] matrix) {
        /**
         * Конструктор класса матрицы
         */
        this.matrix = matrix;
        this.n = matrix.length;
        this.m = matrix[0].length;
    }

    public Matrix tmatrix() {
        System.out.println("d) Транспонированная матрица:");
        double[][] t_matrix = new double[m][n]; //меняем параметры местами
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t_matrix[i][j] = matrix[j][i];
            }

        }
        return new Matrix(t_matrix);
    }

    //public Matrix pow_matrix(){
    //System.out.println("e) Возведенная матрица в степень:");
    //}
    public void show_matrix() {

        for (int i = 0; i < n; i++) {


            for (int j = 0; j < m; j++) {

            }
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public double getElement(int n, int m) {
        return matrix[n][m];
    }

    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {

        if (matrix1.getM() == matrix2.getN() && matrix1.getN() == matrix2.getM()) {
            double[][] m_matrix = new double[matrix1.getN()][matrix2.getM()];
            for (int i = 0; i < matrix1.getN(); i++) {
                for (int j = 0; j < matrix2.getM(); j++) {
                    for (int r = 0; r < matrix2.getN(); r++) {
                        m_matrix[i][j] += matrix1.getElement(i, r) * matrix2.getElement(r, j);
                    }
                }
            }
            return new Matrix(m_matrix);
        } else {
            System.out.println("Нельзя умножить эти матрицы!");
            return null;
        }
    }

    public static Matrix add_substract(Matrix matrix1, Matrix matrix2, boolean flag) {
        if (matrix1.getM() == matrix2.getM() && matrix1.getN() == matrix2.getN()) {
            double[][] r_matrix = new double[matrix1.getN()][matrix1.getM()];
            for (int i = 0; i < matrix1.getN(); i++) {
                for (int j = 0; j < matrix1.getM(); j++) {
                    if (flag) {
                        r_matrix[i][j] = matrix1.getElement(i, j) + matrix2.getElement(i, j);
                    } else {
                        r_matrix[i][j] = matrix1.getElement(i, j) - matrix2.getElement(i, j);
                    }

                }
            }
            return new Matrix(r_matrix);


        } else {
            System.out.println("Нельзя сложить/вычесть эти матрицы!");
            return null;
        }
    }

    public static Matrix num_matrix(Matrix matrix1, double num) {
        double[][] matrix = new double[matrix1.getN()][matrix1.getM()];
        for (int i = 0; i < matrix1.getN(); i++) {
            for (int j = 0; j < matrix1.getM(); j++) {
                matrix[i][j] = matrix1.getElement(i, j) * num;
            }

        }
        System.out.println("b) Умножено на число "+num+"!");
        return new Matrix(matrix);
    }

}