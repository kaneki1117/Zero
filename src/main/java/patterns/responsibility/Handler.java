package patterns.responsibility;

public abstract class Handler {

    public Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract String handleRequest(RequestModel rm);


}
