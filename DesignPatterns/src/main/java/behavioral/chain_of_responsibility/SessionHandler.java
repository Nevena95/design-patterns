package behavioral.chain_of_responsibility;

public class SessionHandler extends Handler {

    public SessionHandler(Handler next) {
        super(next);
    }

    @Override
    protected void doHandle(Request request) {
        System.out.println("Extracting session from header " + request.header());
    }
}
