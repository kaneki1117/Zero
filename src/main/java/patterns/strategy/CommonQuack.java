package patterns.strategy;

public class CommonQuack implements QuackBehaviour {

    public void performQuack() {
        System.out.println("common quack");
    }
}
