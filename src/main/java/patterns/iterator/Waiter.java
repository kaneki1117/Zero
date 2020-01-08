package patterns.iterator;

import java.util.Iterator;

public class Waiter {
    private Menu[] menus;

    public Waiter(Menu[] menus) {
        this.menus = menus;
    }

    public void print(){
        for(Menu menu : menus){
            System.out.println("-----");
            Iterator i = menu.createIterator();
            while (i.hasNext()){
                System.out.println(i.next());
            }
        }

    }
}
