package patterns.factory.simple;

public class PizzaFactory {

    public Pizza createPizza(String type){
        if(type.equals("clam")){
            return new ClamPizza();
        }else {
            return new CheesePizza();
        }

    }
}
