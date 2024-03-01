package creational.singleton.hungry;

public class Run implements Runnable {
    @Override
    public void run() {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + hungrySingleton);
    }
}
