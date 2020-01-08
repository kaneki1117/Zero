package patterns.factory.method;

public abstract class PizzaStore {

    public void orderPizza(String type){

        Pizza pizza = createPizza(type);

        pizza.bake();


    }

    public abstract Pizza createPizza(String type);
}
