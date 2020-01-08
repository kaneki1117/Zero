package patterns.command;

public class FanLowCommand implements Command {
    private Fan fan;
    private int preStatus;

    public FanLowCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.preStatus = fan.getStatus();
        fan.low();
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
