package patterns.template;

public class Tea extends Beverage{
    @Override
    public void brew() {
        System.out.println("brew the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("add for tea");
    }
}
