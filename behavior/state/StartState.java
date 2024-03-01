package behavior.state;

public class StartState implements State{
    @Override
    public void operator(Context context) {
        System.out.println("当前操作已开始...");
        context.setState(this);
    }

    public String toString() {
        return "当前操作正在进行中...";
    }
}
