package patterns.strategy;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour;

    protected QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly(){
        flyBehaviour.performFly();
    }

    public void performQuack(){
        quackBehaviour.performQuack();
    }
}
