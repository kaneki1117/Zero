package patterns.factory.method;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("clam")){
            return new NYClamPizza();
        }else {
            return new NYCheesePizza();
        }
    }
}
