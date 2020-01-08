package patterns.strategy;

public class MiniDuck extends Duck {

    public MiniDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new CommonQuack();
    }

    public void display() {
        System.out.println("I am mini duck");
    }
}
