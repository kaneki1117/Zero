package patterns.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public String buildContent(){
        StringBuffer res = new StringBuffer();
        res.append(builder.buildHead());
        res.append("body : ");
        res.append(builder.buildBody());
        res.append("foot : ");
        res.append(builder.buildFoot());
        System.out.println(res);
        return res.toString();
    }
}
