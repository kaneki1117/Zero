package patterns.factory.method;

public class NYClamPizza extends Pizza {
    @Override
    public void bake() {
        System.out.println("bake NY clam pizza");
    }
}
