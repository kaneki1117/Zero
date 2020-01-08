package patterns.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void methodA() {
        System.out.println("wild turkey methodA");
    }

    @Override
    public void methodC() {
        System.out.println("wild turkey methodC");
    }
}
