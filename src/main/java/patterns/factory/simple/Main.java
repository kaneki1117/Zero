package patterns.factory.simple;

public class Main {
    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        Pizza pizza = pizzaStore.createPizza("clam");
        System.out.println(pizza instanceof CheesePizza);
        System.out.println(pizza instanceof ClamPizza);
    }
}
