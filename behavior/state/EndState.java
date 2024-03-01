package behavior.state;

public class EndState implements State{
    @Override
    public void operator(Context context) {
        System.out.println("当前操作已结束...");
        context.setState(this);
    }

    public String toString() {
        return "当前操作正在结束中...";
    }
}
