package patterns.builder;

public class Test {

    public static void main(String[] args) {
        Builder txt = new TxtBuilder();
        Builder xml = new XmlBuilder();
        Director director = new Director(txt);
        director.buildContent();
        director = new Director(xml);
        director.buildContent();
    }
}
