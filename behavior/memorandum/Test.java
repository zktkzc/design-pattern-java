package behavior.memorandum;

public class Test {
    public static void main(String[] args) {
        Memorandum memorandum = new Memorandum();
        Container container = new Container();
        memorandum.setState("1# 打开冰箱");
        container.add(memorandum.saveStateToOrder());
        memorandum.setState("2# 将大象放进去");
        container.add(memorandum.saveStateToOrder());
        memorandum.setState("3# 关上冰箱门");
        container.add(memorandum.saveStateToOrder());

        System.out.println("==========当前步骤==========");
        System.out.println(memorandum.getState());

        System.out.println("==========备忘录==========");
        Order order = container.getOrder(0);
        memorandum.getStateFromOrder(order);
        System.out.println(memorandum.getState());
        order = container.getOrder(1);
        memorandum.getStateFromOrder(order);
        System.out.println(memorandum.getState());
        order = container.getOrder(2);
        memorandum.getStateFromOrder(order);
        System.out.println(memorandum.getState());
    }
}
