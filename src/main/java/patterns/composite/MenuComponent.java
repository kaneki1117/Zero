package patterns.composite;

public class MenuComponent extends Component{
    String name;
    String description;

    public MenuComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("MenuComponent");
        System.out.println("name : " + getName() +" desc : " + getDescription() );
    }
}
