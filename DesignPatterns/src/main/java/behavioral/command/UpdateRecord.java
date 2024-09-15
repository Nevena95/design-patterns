package behavioral.command;

public class UpdateRecord extends Command {
    private final Database db;
    private final DBRecord record;
    private final int id;
    private DBRecord backup;

    public UpdateRecord(Database db, DBRecord record, int id) {
        this.db = db;
        this.record = record;
        this.id = id;
    }

    @Override
    public void execute() throws Exception {
        super.execute();

        db.update(id, record);
    }

    @Override
    public void createBackup() {
        backup = db.getData(id);
    }

    @Override
    public void undo() {
        db.update(id, backup);
    }
}
