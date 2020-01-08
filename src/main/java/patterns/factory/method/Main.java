package patterns.factory.method;

public class Main {
    public static void main(String[] args) {
        PizzaStore store1 = new NYPizzaStore();
        PizzaStore store2 = new LAPizzaStore();

        Pizza cheese = store1.createPizza("cheese");
        System.out.println(cheese instanceof  NYCheesePizza);

        Pizza clam = store2.createPizza("clam");
        System.out.println(clam instanceof LAClamPizza);
        System.out.println(clam instanceof LACheesePizza);
    }
}
