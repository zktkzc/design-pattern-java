package creational.singleton.broker;

import creational.singleton.enumSingleton.EnumSingleton;
import creational.singleton.lazy.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflect {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
        Constructor<LazySingleton> constructor = lazySingletonClass.getDeclaredConstructor();
        // 赋予权限
        constructor.setAccessible(true);
        LazySingleton lazySingleton = constructor.newInstance();
        System.out.println(lazySingleton);
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println(lazySingleton1);
        System.out.println(lazySingleton1 == lazySingleton);
    }
}
