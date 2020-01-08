package patterns.adapter;

public class Main {

    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(wildTurkey);
        duck.methodA();
        duck.methodB();

    }
}
