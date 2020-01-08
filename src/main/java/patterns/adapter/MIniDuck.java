package patterns.adapter;

public class MIniDuck implements Duck {

    @Override
    public void methodA() {
        System.out.println("Mini duck methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Mini duck methodB");
    }
}
