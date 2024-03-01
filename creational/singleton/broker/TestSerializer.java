package creational.singleton.broker;

import creational.singleton.enumSingleton.EnumSingleton;

import java.io.*;

public class TestSerializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 枚举
        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(enumSingleton);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton"));
        EnumSingleton objInstance = (EnumSingleton) ois.readObject();

        System.out.println(enumSingleton);
        System.out.println(objInstance);
        System.out.println(objInstance == enumSingleton);
    }
}
