package third.stringbuilder;

public class Main {
    public static void main(String[] args) {
     //1 задача
     UndoableStringBuilder und = new UndoableStringBuilder();
     und.append("asdfg");
     und.append("a");
     System.out.println(und.toString());
     und.undo();
     System.out.println(und.toString());
     und.replace(1,2,"f");
     System.out.println(und.toString());
     und.undo();
     System.out.println(und.toString());

     //2 задача
     ObservableStringBuilder obs = new ObservableStringBuilder();
     obs.append("П");
     obs.setListener(new Listener()); //выключен был, поэтому не уведомил
     obs.append("ривет, я тут появлюсь?)");
    }
}
