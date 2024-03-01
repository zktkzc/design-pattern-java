package behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 股票经纪人，记录用户操作的命令
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
