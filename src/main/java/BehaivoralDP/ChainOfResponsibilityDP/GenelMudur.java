package BehaivoralDP.ChainOfResponsibilityDP;

public class GenelMudur extends Approver {
    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveloan(int amount) {
        System.out.println("Approve by General Manager");
        System.out.println("****************");
        return false;
    }
}
