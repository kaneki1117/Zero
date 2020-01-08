package patterns.builder;

public class TxtBuilder implements Builder {

    public String buildHead() {
        String head = "txt head content";
        return head;
    }

    public String buildBody() {
        String body = "txt head content";
        return body;
    }

    public String buildFoot() {
        String foot = "txt head content";
        return foot;
    }
}
