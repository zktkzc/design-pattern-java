package structural.decorator;

public class Test {
    public static void main(String[] args) {
        ABatterCake batterCake = new BatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        System.out.println("套餐信息：" + batterCake.getInfo() + " " + "价格：" + batterCake.getCost());
    }
}
