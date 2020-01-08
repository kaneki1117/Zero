package patterns.command;

public class Fan {
    public static final int HIGH = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int status;

    public Fan() {
        this.status = OFF;
    }

    public int getStatus() {
        return status;
    }

    public void high(){
        this.status = HIGH;
        System.out.println("status : " + status);
    }

    public void low(){
        this.status = LOW;
        System.out.println("status : " + status);

    }

    public void off(){
        this.status = OFF;
        System.out.println("status : " + status);
    }
}
