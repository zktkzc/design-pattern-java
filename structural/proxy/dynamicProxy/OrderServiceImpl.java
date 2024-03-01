package structural.proxy.dynamicProxy;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        System.out.println("业务层，调用持久层");
        orderDao = new OrderDaoImpl();
        return orderDao.insert(order);
    }
}
