package patterns.command;

public class CommandSlot {

    public Command[] onCommands;
    public Command[] offCommands;
    public Command noCommand;
    public Command undoCommand;

    public CommandSlot() {
        onCommands = new Command[2];
        offCommands = new Command[2];
        noCommand = new NoCommand();

        for (int i = 0; i < 2; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void executeOnSlot(int index){
        undoCommand = onCommands[index];
        onCommands[index].execute();
    }

    public void executeOffSlot(int index){
        undoCommand = offCommands[index];
        offCommands[index].execute();
    }

    public void setCommand(int index, Command onCommand, Command offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void undo(){
        undoCommand.undo();
    }
}
