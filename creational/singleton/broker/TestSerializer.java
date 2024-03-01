package creational.singleton.broker;

import creational.singleton.lazy.LazySingleton;

import java.io.*;

public class TestSerializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 懒汉式
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(lazySingleton);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton"));
        LazySingleton objInstance = (LazySingleton) ois.readObject();

        System.out.println(lazySingleton);
        System.out.println(objInstance);
        System.out.println(objInstance == lazySingleton);
    }
}
