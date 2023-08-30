package CreationalDP.SingletonDP;

public class SingletonObject {
    public String message = "Hello";

    private static SingletonObject instance;

    public static SingletonObject getInstance(){
        if(instance == null){
            instance = new SingletonObject();
        }

        return instance;
    }
}
