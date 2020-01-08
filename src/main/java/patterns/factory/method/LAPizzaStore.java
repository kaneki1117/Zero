package patterns.factory.method;

public class LAPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("clam")){
            return new LAClamPizza();
        }else {
            return new LACheesePizza();
        }
    }
}
