package third.button;

public class ButtonClickHandler implements eventHandler {

    @Override
    public void execute() {
        System.out.println("CLICK!");
    }
    public static void click2() {
        System.out.println("CLICK2");
    }
}
