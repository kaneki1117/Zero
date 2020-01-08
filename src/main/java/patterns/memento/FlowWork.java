package patterns.memento;

public class FlowWork {

    private String state;

    public String getState() {
        return state;
    }

    public Memento saveToMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

    public void runOnephase(){
        state = "111";
    }

    public String schema1(){
        state += "222";
        return state;
    }

    public String schema2(){
        state += "333";
        return state;
    }
}
