package behavior.memorandum;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Order> orderList = new ArrayList<>();

    public void add(Order order) {
        this.orderList.add(order);
    }

    public Order getOrder(int index) {
        return this.orderList.get(index);
    }
}
