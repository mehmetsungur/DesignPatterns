package CreationalDP.SingletonDP;

public class Runner {
    public static void main(String[] args) {
        SingletonObject obj1 = new SingletonObject();
        SingletonObject obj2 = new SingletonObject();

        System.out.println(obj1 == obj2);

        SingletonObject obj3 = SingletonObject.getInstance();
        SingletonObject obj4 = SingletonObject.getInstance();

        System.out.println(obj3 == obj4);

        System.out.println(obj3.message);
        obj3.changeMessage();
        System.out.println(obj3.message);

        System.out.println(obj4.message);
    }
}
