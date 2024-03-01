package behavior.observer;

public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        // 将当前观察者与主题绑定
        this.subject = subject;
        // 将当前观察者添加到主题的观察者列表中
        this.subject.bind(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String：" + Integer.toHexString(subject.getState()));
    }
}
