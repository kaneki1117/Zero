package patterns.responsibility;

public class FeeRequestModel extends RequestModel {

    private int fee;
    private String user;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public FeeRequestModel(String type) {
        super(type);
    }

}
