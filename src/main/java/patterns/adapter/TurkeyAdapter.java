package patterns.adapter;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void methodA() {
        turkey.methodA();
    }

    @Override
    public void methodB() {
        turkey.methodC();
        turkey.methodC();
        turkey.methodC();
    }
}
