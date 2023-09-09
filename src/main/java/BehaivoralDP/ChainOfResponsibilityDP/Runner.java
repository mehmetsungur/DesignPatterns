package BehaivoralDP.ChainOfResponsibilityDP;

public class Runner {
    public static void main(String[] args) {
        Approver generalManager = new GenelMudur();
        Approver manager = new Mudur(generalManager);
        Approver stuff = new Memur(manager);

        System.out.println("Limits of the Credit Approval");
        System.out.println("Staff max: 5000");
        System.out.println("Manager max: 10000");
        System.out.println("General Manager max: Limitless");

        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("Requested amount: 1000");
        stuff.approveloan(1000);

        System.out.println("Requested amount: 7000");
        stuff.approveloan(7000);

        System.out.println("Requested amount: 12000");
        stuff.approveloan(12000);
    }
}
