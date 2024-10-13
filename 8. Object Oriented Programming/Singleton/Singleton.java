package Singleton;

public class Singleton {
    private Singleton () {

    }
    private static Singleton instance;

    public static Singleton getInstance() {
        //check whether only 1 obj is created or not
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
