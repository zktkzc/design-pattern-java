package creational.singleton.doubleChecked;

public class Run implements Runnable {
    @Override
    public void run() {
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + doubleCheckSingleton);
    }
}
