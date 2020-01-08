package patterns.state;

public class CandyMachine {
    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;
    private SoldOutState soldOutState;
    private State state = soldOutState;

    int count = 0;

    public CandyMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.release();
    }

    //允许其他对象（如状态对象等） 改变糖果机的状态
    public void setState(State state) {
        this.state = state;
    }
}
