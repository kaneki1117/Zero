package patterns.factory.simple;

public class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza createPizza(String type){
        return factory.createPizza(type);
    }

}
