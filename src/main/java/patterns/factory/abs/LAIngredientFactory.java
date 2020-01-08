package patterns.factory.abs;

public class LAIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }
}
