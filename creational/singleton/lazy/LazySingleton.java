package creational.singleton.lazy;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }

    public Object readResolve() {
        return lazySingleton;
    }
}
