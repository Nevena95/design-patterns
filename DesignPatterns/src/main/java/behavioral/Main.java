package behavioral;

public class Main {
    public static void main(String[] args) {
        Request request = new Request("testHeader", "testBody");

        Handler processRequestHandler = new ProcessRequestHandler(null);
        Handler loggingDataExtractorHandler = new LoggingDataExtractorHandler(processRequestHandler);
        Handler sessionHandler = new SessionHandler(loggingDataExtractorHandler);

        // chain: sessionHandler -> loggingDataExtractorHandler -> processRequestHandler

        sessionHandler.handleRequest(request);
    }
}
