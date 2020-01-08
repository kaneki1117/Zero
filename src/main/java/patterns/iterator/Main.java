package patterns.iterator;

import com.google.common.collect.Lists;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Menu menu1 = new BreakFastMenu();
        Menu menu2 = new DinnerMenu();
        Menu[] menus = new Menu[]{menu1,menu2};
        Waiter waiter = new Waiter(menus);
        waiter.print();


    }
}
