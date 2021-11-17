package buoi14;

public class Main {

    public static void main(String[] args) {

        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();

        eagerInitializedSingleton.run();
    }

}
