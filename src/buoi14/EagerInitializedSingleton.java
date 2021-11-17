package buoi14;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }

    public void run(){
        System.out.printf("run");
    }

}
