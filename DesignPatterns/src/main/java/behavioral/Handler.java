package behavioral;

public abstract class Handler {
    private final Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    protected abstract void doHandle(Request request);

    public void handleRequest(Request request) {
        doHandle(request);

        if (next != null) {
            next.handleRequest(request);
        }
    }
}
