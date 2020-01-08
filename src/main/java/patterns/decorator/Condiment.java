package patterns.decorator;

public abstract class Condiment extends Beverage{

    private Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

    public float getCost(){
        return beverage.getCost();
    }
}
