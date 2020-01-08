package patterns.command;

public class FanOffCommand implements Command {
    private Fan fan;
    private int preStatus;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.preStatus = fan.getStatus();
        fan.off();
    }

    @Override
    public void undo() {
        if(preStatus == Fan.HIGH){
            fan.high();
        }else if(preStatus == Fan.LOW){
            fan.low();
        }else {
            fan.off();
        }
    }
}
