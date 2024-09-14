package behavioral;

public class ProcessRequestHandler extends Handler {

    public ProcessRequestHandler(Handler next) {
        super(next);
    }

    @Override
    protected void doHandle(Request request) {
        System.out.println("Processing request body " + request.body());
    }
}
