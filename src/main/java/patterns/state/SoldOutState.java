package patterns.state;

public class SoldOutState implements State {
    private CandyMachine candyMachine;

    public SoldOutState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Success");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("no no no");
    }

    @Override
    public void turnCrank() {
        System.out.println("no no no");
    }

    @Override
    public void release() {
        System.out.println("no no no");
    }
}
