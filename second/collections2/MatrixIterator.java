package second.collections2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIterator<T> implements Iterator<T> {
    private final int size; //размер массива
    private int row = 0;
    private int col = 0; //столбец и строка текущего элемента
    private int position = 0;//номер текущего элемента для "выдачи"
    private T[][] matrix;


    public MatrixIterator(T[][] matrix) {
        this.matrix = matrix;
        this.size = countSize(matrix);
    }

    public int countSize(T[][] matrix) {
        /**
         * Подсчет кол-ва элементов матрицы
         */
        int count = 0;
        for (T[] row : matrix) {
            count += row.length;
        }
        return count;
    }

    @Override
    public boolean hasNext() {
        return position < size;
    }

    @Override
    public T next() {
        if (position >= size) { //если перебрали все элементы
            throw new NoSuchElementException();
        }
        T element = matrix[row][col];  //текущий элемент
        position++;
        col++;
        while (row < matrix.length && col >= matrix[row].length) { // пропустить возможные "пустые" строки
            //{{1, 2, 3}, {}, {4, 5}, {6}} - например
            col = 0;
            row++;
        }
        return element;
    }
}
