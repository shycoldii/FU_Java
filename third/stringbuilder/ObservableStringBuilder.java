package third.stringbuilder;

interface ChangeListener {
    //шаблон наблюдения
    void onChange(ObservableStringBuilder stringBuilder);
}
class Listener implements ChangeListener{
    //прослушивание стрингбилдера
    @Override
    public void onChange(ObservableStringBuilder stringBuilder) {
        System.out.println("Новое изменение пользователем: " + stringBuilder.toString());
    }
}
public class ObservableStringBuilder {
    /**
     * Класс с возможностью оповещения других объектов об изменении своего состояния
     */
    private ChangeListener listener; //слушатель
    private StringBuilder stringBuilder; //делегат

    public ObservableStringBuilder(){
       stringBuilder = new StringBuilder();
    }

    public void setListener(ChangeListener listener){
        this.listener = listener;
    }
    private void notifylistener(){
        if(listener != null){
            listener.onChange(this);
        }
        else{
            System.out.println("Извини, но оповещение выключено.");
        }
    }
    //переопределение методов
    public ObservableStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        notifylistener();
        return this;
    }
    public ObservableStringBuilder append(String str) {
        stringBuilder.append(str);
        notifylistener();
        return this;
    }
    public ObservableStringBuilder appendCodePoint(int CodePoint) {
        stringBuilder.appendCodePoint(CodePoint);
        notifylistener();
        return this;
    }
    public ObservableStringBuilder delete(int start,int end) {
        stringBuilder.delete(start,end);
        notifylistener();
        return this;
    }
    public ObservableStringBuilder deleteCharAt(int index) {
        stringBuilder.deleteCharAt(index);
        notifylistener();
        return this;
    }
    public ObservableStringBuilder replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifylistener();
        return this;
    }
    public ObservableStringBuilder insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        notifylistener();
        return this;
    }
    public String toString() {
        return stringBuilder.toString();
    }
    public ObservableStringBuilder indexOf(String str) {
        stringBuilder.indexOf(str);
        notifylistener();
        return this;
    }
    public ObservableStringBuilder indexOf(String str,int fromindex) {
        stringBuilder.indexOf(str,fromindex);
        notifylistener();
        return this;
    }
    public ObservableStringBuilder lastIndexOf(String str) {
        stringBuilder.lastIndexOf(str);
        notifylistener();
        return this;
    }
    public ObservableStringBuilder lastIndexOf(String str,int fromindex) {
        stringBuilder.lastIndexOf(str,fromindex);
        notifylistener();
        return this;
    }
    public ObservableStringBuilder reverse() {
        stringBuilder.reverse();
        notifylistener();
        return this;
    }
}
