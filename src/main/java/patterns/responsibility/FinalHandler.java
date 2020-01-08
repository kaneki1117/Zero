package patterns.responsibility;

public class FinalHandler extends Handler {

    @Override
    public String handleRequest(RequestModel rm){
        FeeRequestModel frm = (FeeRequestModel)rm ;
        if(frm.getFee() < 2000){
            if(frm.getUser().equals("Ming")){
                return "final manager accept";
            }else {
                return "final manager reject";
            }

        }else {
            return this.successor.handleRequest(rm);
        }

    }
}
