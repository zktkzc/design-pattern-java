package behavior.mediator;

public class Test {
    public static void main(String[] args) {
        User zhangsan = new User("张三");
        User lisi = new User("李四");
        zhangsan.sendMessage("李四帮我定一下外卖");
        lisi.sendMessage("好的");
    }
}
