package creational.singleton.hungry;

public class HungrySingleton {
//    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private static HungrySingleton hungrySingleton = null;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
