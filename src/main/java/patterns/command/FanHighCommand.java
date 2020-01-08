package patterns.command;

public class FanHighCommand implements Command {
    private Fan fan;
    private int preStatus;

    public FanHighCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.preStatus = fan.getStatus();
        fan.high();
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
