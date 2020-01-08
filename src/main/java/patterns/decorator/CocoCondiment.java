package patterns.decorator;

public class CocoCondiment extends Condiment{

    //不要忘了写这个构造
    public CocoCondiment(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public float getCost() {
        return super.getCost() + 8;
    }
}
