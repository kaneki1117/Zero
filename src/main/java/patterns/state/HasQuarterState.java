package patterns.state;

public class HasQuarterState implements State {
    private CandyMachine candyMachine;

    public HasQuarterState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Success");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("eject Success");
    }

    @Override
    public void turnCrank() {
        System.out.println("turn and get the candy");
    }

    @Override
    public void release() {
        System.out.println("no no no");
    }
}
