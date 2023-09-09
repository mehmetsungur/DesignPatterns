package BehaivoralDP.ChainOfResponsibilityDP;

public class Memur extends Approver {
    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveloan(int amount) {
        if(amount<5000){
            System.out.println("Approve by Staff");
            System.out.println("****************");
            return true;
        }else if(chief!=null){
            System.out.println("Forwarding to Chief");
            return chief.approveloan(amount);
        }
        return false;
    }
}
