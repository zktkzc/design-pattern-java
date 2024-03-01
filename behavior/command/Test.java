package behavior.command;

public class Test {
    public static void main(String[] args) {
        Stock aaaStock = new Stock();
        BuyStock buyStock = new BuyStock(aaaStock);
        SaleStock saleStock = new SaleStock(aaaStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(saleStock);
        broker.placeOrders();
    }
}
