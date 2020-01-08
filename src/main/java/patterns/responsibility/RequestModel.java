package patterns.responsibility;

public class RequestModel {

    String type;

    public RequestModel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
