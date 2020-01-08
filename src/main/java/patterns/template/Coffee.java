package patterns.template;

public class Coffee extends Beverage {
    @Override
    public void brew() {
        System.out.println("coffee brew");
    }

    @Override
    public void addCondiments() {
        System.out.println("add milk for coffee");
    }
}
