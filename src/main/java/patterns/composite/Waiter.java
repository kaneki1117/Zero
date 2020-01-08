package patterns.composite;

public class Waiter {
    Component all;

    public Waiter(Component all) {
        this.all = all;
    }

    public void print(){
        all.print();
    }
}
