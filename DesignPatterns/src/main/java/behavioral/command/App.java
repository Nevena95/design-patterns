package behavioral.command;

import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Database db = new Database();
        Stack<Command> stack = new Stack<>();

        CreateRecord create = new CreateRecord(db, new DBRecord("first_data"));
        DBRecord updateData = new DBRecord("second_data");
        UpdateRecord update = new UpdateRecord(db, updateData, create.getId());
        LogUpdate log = new LogUpdate(updateData);

        try {
            create.execute();
        } catch (Exception e) {
            stack.push(create);
        }

        try {
            update.execute();
        } catch (Exception e) {
            stack.push(update);
        }

        try {
            log.execute();
        } catch (Exception e) {
            stack.push(log);
        }

        while (!stack.empty()) {
            Command failedCommand = stack.pop();
            failedCommand.undo();
        }
    }
}
