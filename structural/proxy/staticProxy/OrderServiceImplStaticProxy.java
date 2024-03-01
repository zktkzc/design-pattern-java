package structural.proxy.staticProxy;

public class OrderServiceImplStaticProxy {
    private OrderService orderService;

    public int saveOrder(Order order) {
        orderService = new OrderServiceImpl();
        before();
        System.out.println("代理对象调用业务层");
        int i = orderService.saveOrder(order);
        after();
        return i;
    }

    private void before() {
        System.out.println("代理对象，开启事务");
    }

    private void after() {
        System.out.println("代理对象，提交事务");
    }
}
