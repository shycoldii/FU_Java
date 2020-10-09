package third.button;

public class Button implements eventHandler {
    eventHandler handler;
    public Button(eventHandler action) {
        this.handler = action;
    }
    @Override
    public void execute() {

    }
    public void click() {
        this.handler.execute();
    }
}
