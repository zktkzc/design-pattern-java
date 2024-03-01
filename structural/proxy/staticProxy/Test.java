package structural.proxy.staticProxy;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setInfo("订单信息");
        order.setUserId("1");
        OrderServiceImplStaticProxy proxy = new OrderServiceImplStaticProxy();
        proxy.saveOrder(order);
    }
}
