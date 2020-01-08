package patterns.responsibility;

public class Main {

    public static void main(String[] args) {
        Handler handler1 = new ProjectHandler();
        Handler handler2 = new DeptHandler();
        Handler handler3 = new FinalHandler();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        FeeRequestModel requestModel = new FeeRequestModel("fee");
        requestModel.setFee(800);
        requestModel.setUser("Ming");

        String res = handler1.handleRequest(requestModel);
        System.out.println(res);
    }
}
