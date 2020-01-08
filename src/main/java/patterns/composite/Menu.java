package patterns.composite;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

public class Menu extends Component {
    List<Component> menus = Lists.newArrayList();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    public void add(Component component){
        menus.add(component);
        }

    public void remove(Component component){
        menus.remove(component);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.println("Menu");

        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()){
            Component c = (Component)menuIterator.next();
            c.print();
        }
    }
}
