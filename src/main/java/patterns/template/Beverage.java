package patterns.template;

public abstract class Beverage {

    public final void makeBeverage(){

        boil();

        brew();

        pourIn();

        if(needCondiment()){
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boil(){
        System.out.println("Boil the beverage");
    }

    public void pourIn(){
        System.out.println("Pour the beverage into the cup");
    }

    public boolean needCondiment(){
        return true;
    }
}
