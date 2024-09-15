package behavioral.command;

//Create a record in DB.
//Call a service to update a related record.
//Call another service to log a ticket.

// To perform this in a transactional manner, each operation is implemented as a command with undo operation.
// At the end of each step, the command is pushed onto a stack.
// If the operation fails at some step, then we pop the commands from the stack and call undo operation on each of the command
// popped out. The undo operation of each step is defined in that command implementation to reverse the earlier command.execute().

public abstract class Command {

    public void execute() throws Exception {
        createBackup();
    }

    public abstract void createBackup();

    public abstract void undo();
}
