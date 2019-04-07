public class FocusHandler {

    protected IKeyEventHandler prevHandler;
    public IScreen screen;

    public void setPrevHandler (IKeyEventHandler iKeyEventHandler) {
        prevHandler = iKeyEventHandler;
    }

    public IKeyEventHandler getPrevHandler () {
        return prevHandler;
    }

    public void setScreen (IScreen s) {
        screen = s;
    }

    public IScreen getScreen() {return screen;};
}
