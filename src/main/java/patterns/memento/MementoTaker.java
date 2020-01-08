package patterns.memento;

public class MementoTaker {

    private Memento memento;

    public MementoTaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
