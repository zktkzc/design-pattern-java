package creational.singleton.doubleChecked;

public class Test {
    public static void main(String[] args) {
        new Thread(new Run(), "t1").start();
        new Thread(new Run(), "t2").start();
    }
}
