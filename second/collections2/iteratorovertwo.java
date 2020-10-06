package second.collections2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class iteratorovertwo<T> implements Iterator<T> {
    /**
     * Итератор, который проходит по двум итераторам, где
     * iterator1,iterator2 - эти итераторы
     * Наследуется от Iterator<T> с переопределением методов hasNext() , next()
     */
    private Iterator<T> iterator1;
    private Iterator<T> iterator2;

    public iteratorovertwo(Iterator<T> iterator1,Iterator<T> iterator2){
        this.iterator1 = iterator1;
        this.iterator2 = iterator2;
    }
    @Override
    public boolean hasNext() {
        while (iterator1.hasNext()) return true;
        while (iterator2.hasNext()) return true;
        return false;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();
        while (iterator1.hasNext()) return iterator1.next();
        while (iterator2.hasNext()) return iterator2.next();
        return null;
    }
}
