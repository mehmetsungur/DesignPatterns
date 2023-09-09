package BehaivoralDP.MediatorDP;

public class Runner {
    public static void main(String[] args) {
        MessageMediator mediator = new MessageMediator();

        Actor actor1 = new Professor("PhD. Chris",mediator);
        Actor actor2 = new Professor("Prof. Brent",mediator);
        Actor actor3 = new Professor("Prof. Stanley",mediator);

        mediator.register("Algorithm",actor1);
        mediator.register("Computer Science",actor2);
        mediator.register("DevOps",actor3);

        System.out.println("Answer the Questions");

        System.out.println("Algorithm' s Questions");
        actor1.sendMessage("Algorithm","What is the Algorithm?");
        System.out.println();

        System.out.println("Computer Science' s Questions");
        actor2.sendMessage("Computer Science","What is the Data?");
        System.out.println();

        System.out.println("DevOps' s Questions");
        actor3.sendMessage("Algorithm","What is the IaC?");
    }
}
