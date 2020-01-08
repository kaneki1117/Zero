package patterns.factory.abs;

import patterns.factory.method.Pizza;

public abstract class PizzaStore {

    public void orderPizza(String type){

        Pizza pizza = createPizza(type);

        pizza.bake();


    }

    public abstract Pizza createPizza(String type);
}
