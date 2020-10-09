package third.button;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ButtonClickHandler eventHandler = new ButtonClickHandler();
        Button button = new Button(eventHandler);
        button.click();
        button.click();
        button.click();
    }
}
