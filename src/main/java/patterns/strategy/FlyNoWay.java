package patterns.strategy;

public class FlyNoWay implements FlyBehaviour{

    public void performFly() {
        System.out.println("I cannot fly");
    }
}
