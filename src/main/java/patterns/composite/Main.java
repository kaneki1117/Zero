package patterns.composite;

public class Main {

    public static void main(String[] args) {
        Component all = new Menu("all");
        Component breakfastMenu = new Menu("breakfastMenu");
        Component dinnerMenu = new Menu("dinnerMenu");
        Component desertMenu = new Menu("desertMenu");
        dinnerMenu.add(new MenuComponent("food1","desc1"));
        dinnerMenu.add(new MenuComponent("food2","desc2"));
        desertMenu.add(new MenuComponent("desert1","desc1"));
        desertMenu.add(new MenuComponent("desert2","desc2"));
        desertMenu.add(new MenuComponent("desert3","desc3"));
        dinnerMenu.add(desertMenu);
        all.add(breakfastMenu);
        all.add(dinnerMenu);
        Waiter waiter = new Waiter(all);
        waiter.print();

    }
}
