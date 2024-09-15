package behavioral.command;

public class CreateRecord extends Command {
    private final Database db;
    private final DBRecord record;
    private int id;

    public CreateRecord(Database db, DBRecord record) {
        this.db = db;
        this.record = record;
    }

    @Override
    public void execute() throws Exception {
        super.execute();

        id = db.insert(record);
    }

    @Override
    public void createBackup() {
        // nothing to do
    }

    @Override
    public void undo() {
        // nothing to do
    }

    public int getId() {
        return id;
    }
}
