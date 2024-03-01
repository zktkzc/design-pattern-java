package creational.singleton.enumSingleton;

public class Test {
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.getInstance();
        EnumSingleton instance2 = EnumSingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}
