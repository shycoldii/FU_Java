package third.stringbuilder;

import java.util.Stack;

public class UndoableStringBuilder {
    private interface Action{
        void undo(); //созданный интерфейс для поддержки undo в каждой функции
    }
    private class DeleteAction implements Action{
        private int size;

        public DeleteAction(int size){
            this.size = size;

        }
        @Override
        public void undo(){
            stringBuilder.delete(stringBuilder.length() - size, stringBuilder.length()); //начальный и конечный индекс
        }
    }

    private java.lang.StringBuilder stringBuilder; //так как сам класс финальный, то делегат

    private Stack<Action> actionStack = new Stack<>(); //стэк

    public UndoableStringBuilder(){
        /**
         * Конструктор класса String Builder с паттерном "Команда"
         */
        stringBuilder = new StringBuilder();
    }
    public void undo(){
        if(!actionStack.isEmpty()){
            actionStack.pop().undo();
        }
    }

    public UndoableStringBuilder reverse(){
        stringBuilder.reverse();

        Action action = new Action(){
            public void undo() {
                stringBuilder.reverse(); //обратная реверсу -реверс
            }
        };
        actionStack.add(action);
        return this;
    }
    public UndoableStringBuilder append(String string){
        stringBuilder.append(string);

        Action action = new Action(){
            public void undo(){
                stringBuilder.delete(
                        stringBuilder.length() - string.length(),
                        stringBuilder.length());
            }
        };

        actionStack.add(action);
        return this;
    }

    //без перегрузок и полиморфизма
    public UndoableStringBuilder appendCodePoint(int codePoint) {
        int len = stringBuilder.length();
        stringBuilder.appendCodePoint(codePoint);
        DeleteAction action = new DeleteAction(stringBuilder.length()-len); //обратное добавлению
        actionStack.add(action);
        return this;
    }
    public UndoableStringBuilder delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end); //часть строки
        stringBuilder.delete(start, end);
        Action action = new Action(){
            public void undo(){
                stringBuilder.insert(start, deleted);
            }
        };
        actionStack.add(action); //вернем
        return this;
    }
    public UndoableStringBuilder deleteCharAt(int index) {
        char deleted = stringBuilder.charAt(index); //значение по индексу
        stringBuilder.deleteCharAt(index);
        Action action = new Action(){
            public void undo(){
                stringBuilder.insert(index, deleted);
            }
        };
        actionStack.add(action);
        return this;
    }
    public UndoableStringBuilder replace(int start, int end, String str) {
        String deleted = stringBuilder.substring(start, end); //значение подстроки
        stringBuilder.replace(start, end, str);
        Action action = new Action(){
            public void undo(){
                stringBuilder.replace(start,end, deleted);
            }
        };
        actionStack.add(action);
        return this;
    }
    public UndoableStringBuilder insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        Action action = new Action(){
            public void undo(){
                stringBuilder.delete(index,len);
            }
        };
        actionStack.add(action);
        return this;
    }
    public UndoableStringBuilder insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        Action action = new Action(){
            public void undo(){
                stringBuilder.delete(offset, str.length());
            }
        };
        //actionStack.add(() -> stringBuilder.delete(offset, str.length()));
        actionStack.add(action);
        return this;
    }
    public String toString() {
        return stringBuilder.toString();
    }
}
