package behavioral.chain_of_responsibility;

public class LoggingDataExtractorHandler extends Handler {

    public LoggingDataExtractorHandler(Handler next) {
        super(next);
    }

    @Override
    protected void doHandle(Request request) {
        System.out.println("Extracting data for logging " + request.header());
    }
}
