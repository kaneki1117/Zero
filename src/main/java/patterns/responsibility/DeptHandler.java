package patterns.responsibility;

public class DeptHandler extends Handler{

    @Override
    public String handleRequest(RequestModel rm){
        FeeRequestModel frm = (FeeRequestModel)rm ;
        if(frm.getFee() < 1000){
            if(frm.getUser().equals("Ming")){
                return "dept manager accept";
            }else {
                return "dept manager reject";
            }

        }else {
            return this.successor.handleRequest(rm);
        }

    }
}
