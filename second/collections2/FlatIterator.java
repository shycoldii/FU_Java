package second.collections2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

//Дан итератор.
// Метод next() возвращает либо String, либо итератор такой же структуры
// (то есть который опять возвращает или String, или такой же итератор).
// Напишите поверх этого итератора другой, уже «плоский»
public class FlatIterator implements Iterator<String> {
   private Stack<Iterator> iteratorStack;
   private String next;
   private boolean hasNext;

   public FlatIterator(Iterator<?> iterator){
       this.iteratorStack = new Stack<Iterator>();
       iteratorStack.push(iterator);
       updateNext();
   }

    @Override
    public boolean hasNext() {
        return hasNext;
    }
    private void updateNext(){
       if(iteratorStack.empty()){
           next = null;
           hasNext = false;
       }
       Iterator current = iteratorStack.peek();
        if (current.hasNext()) {
            Object o = current.next();
            if (o instanceof String) {
                next = (String) o;
                hasNext = true;
            } else if (o instanceof Iterator) {
                Iterator iterator = (Iterator) o;
                iteratorStack.push(iterator);
                updateNext();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            iteratorStack.pop();
            updateNext();
        }
    }
    @Override
    public String next() throws NoSuchElementException {
       if (!hasNext){
           throw new NoSuchElementException();
       }
       String nexttoreturn = next;
       updateNext();
       return nexttoreturn;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

