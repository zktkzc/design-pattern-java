package behavior.state;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        State start = new StartState();
        start.operator(context);
        System.out.println(context.getState().toString());
        State end = new EndState();
        end.operator(context);
        System.out.println(context.getState().toString());
    }
}
