package patterns.memento;

public class Main {

    public static void main(String[] args) {
        FlowWork work = new FlowWork();
        work.runOnephase();
        System.out.println(work.getState());

        MementoTaker taker = new MementoTaker(work.saveToMemento());

        work.schema1();
        System.out.println(work.getState());

        work.setMemento(taker.getMemento());
        work.schema2();
        System.out.println(work.getState());
    }
}
