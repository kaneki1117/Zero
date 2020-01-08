package patterns.command;

public class Main {

    public static void main(String[] args) {
        CommandSlot slot = new CommandSlot();
        Light light = new Light();
        Fan fan = new Fan();
        FanHighCommand fanHighCommand = new FanHighCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        slot.setCommand(0, fanHighCommand, fanOffCommand);
        slot.setCommand(1, lightOnCommand, lightOffCommand);

        slot.executeOnSlot(0);
        slot.undo();
        slot.executeOnSlot(1);
        slot.undo();
        slot.executeOffSlot(0);
        slot.undo();
        slot.executeOffSlot(1);

        //


    }
}
