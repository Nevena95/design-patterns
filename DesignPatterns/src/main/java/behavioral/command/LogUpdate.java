package behavioral.command;

public class LogUpdate extends Command {
    private final DBRecord record;

    public LogUpdate(DBRecord record) {
        this.record = record;
    }

    @Override
    public void execute() throws Exception {
        super.execute();

        System.out.println("Updated record with new state " + record);
    }

    @Override
    public void createBackup() {
        // nothing to do
    }

    @Override
    public void undo() {
        // nothing to do
    }
}
