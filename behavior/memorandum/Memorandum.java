package behavior.memorandum;

public class Memorandum {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Order saveStateToOrder() {
        return new Order(state);
    }

    public void getStateFromOrder(Order order) {
        this.state = order.getState();
    }
}
