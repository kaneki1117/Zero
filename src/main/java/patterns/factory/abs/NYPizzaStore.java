package patterns.factory.abs;

import patterns.factory.method.NYCheesePizza;
import patterns.factory.method.NYClamPizza;
import patterns.factory.method.Pizza;

public class NYPizzaStore extends PizzaStore {
    private NYIngredientFactory factory;


    @Override
    public Pizza createPizza(String type) {
        factory.createDough();
        factory.createSauce();

        if(type.equals("clam")){
            return new NYClamPizza();
        }else {
            return new NYCheesePizza();
        }
    }
}
