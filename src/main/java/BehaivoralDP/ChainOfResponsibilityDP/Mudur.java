package BehaivoralDP.ChainOfResponsibilityDP;

public class Mudur extends Approver {
    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveloan(int amount) {
        if(amount<10000){
            System.out.println("Approve by Manager");
            System.out.println("****************");
            return true;
        }else if(chief!=null){
            System.out.println("Forwarding to Chief");
            return chief.approveloan(amount);
        }
        return false;
    }
}
