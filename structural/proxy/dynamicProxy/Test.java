package structural.proxy.dynamicProxy;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setInfo("订单信息");
        order.setUserId("1");
        OrderService proxy = (OrderService) new OrderServiceImplDynamicProxy(new OrderServiceImpl()).bind();
        proxy.saveOrder(order);
    }
}
