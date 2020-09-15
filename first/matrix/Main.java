package matrix;

public class Main {
    public static void main(String[] args)  {
        double[][] A =  {{3,4,2},
                     {3,9,10},
                     {2,4,7},
                {2,4,7},
                {2,3,7},
                     };

        double[][] B = {{10,1,3,5,6},
                    {3,5,7,1,4},
                    {5,6,2,6,3}};

        double[][] C =  {{3,4,2},
                {3,9,10},
                {2,4,7}};
        double[][] D =  {{3,4,2},
                {3,9,10},
                {2,4,7}};
        Matrix matrix1 = new Matrix(A);
        Matrix matrix2 = new Matrix(B);
        Matrix matrix3 = new Matrix(C);
        Matrix matrix4 = new Matrix(D);

        matrix1.show_matrix();
        //matrix2.show_matrix(2);
        matrix1.tmatrix();
        matrix4.tmatrix();
        matrix4.show_matrix();
        int degree = 3;
        Matrix d = new Matrix(C);
        for(int i =0; i<degree-1; i++){
            if (i==0){
                d = Matrix.multiply(matrix3,matrix3);
            }
            if (i>0){
                d = Matrix.multiply(d,matrix3);
            }

        }

        if (d!=null){
            System.out.println("e) Возведено в степень!");
            d.show_matrix();
        }
        d = Matrix.num_matrix(matrix1,3);
        d.show_matrix();

        Matrix a = Matrix.multiply(matrix1,matrix2);
        Matrix b = Matrix.add_substract(matrix1,matrix2,true);
        if (a!=null){
            System.out.println("c) Матрицы успешно перемножены!");
            a.show_matrix();
        }

        Matrix f = Matrix.add_substract(matrix3,matrix4,true);
        Matrix e = Matrix.add_substract(matrix3,matrix4,false);
        if (f!=null){
            System.out.println("c) Матрицы успешно сложены/вычтены!");
            f.show_matrix();
            e.show_matrix();
        }




    }
}
