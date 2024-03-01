package creational.singleton.staticInnerClass;

public class Run implements Runnable {
    @Override
    public void run() {
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + staticInnerClassSingleton);
    }
}
