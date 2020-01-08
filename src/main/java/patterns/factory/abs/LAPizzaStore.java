package patterns.factory.abs;

import patterns.factory.method.LACheesePizza;
import patterns.factory.method.LAClamPizza;
import patterns.factory.method.Pizza;

public class LAPizzaStore extends PizzaStore {

    private LAIngredientFactory factory;

    @Override
    public Pizza createPizza(String type) {
        factory.createDough();
        factory.createSauce();

        if(type.equals("clam")){
            return new LAClamPizza();
        }else {
            return new LACheesePizza();
        }
    }
}
