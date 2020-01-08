package patterns.responsibility;

public class ProjectHandler extends Handler{

    @Override
    public String handleRequest(RequestModel rm){
       FeeRequestModel frm = (FeeRequestModel)rm ;
       if(frm.getFee() < 500){
           if(frm.getUser().equals("Ming")){
               return "project manager accept";
           }else {
               return "project manager reject";
           }

       }else {
           return this.successor.handleRequest(rm);
       }

    }
}
