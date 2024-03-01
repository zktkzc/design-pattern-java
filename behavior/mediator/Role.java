package behavior.mediator;

public class Role {
    public static void work(User user, String message) {
        System.out.println("姓名：" + user.getName() + "，任务：" + message);
    }
}
