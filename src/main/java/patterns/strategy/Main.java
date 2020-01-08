package patterns.strategy;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MiniDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();
    }
}
