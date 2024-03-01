package behavior.command;

/**
 * 购买股票
 */
public class BuyStock implements Order{
    private Stock aaaStock;

    public BuyStock(Stock aaaStock) {
        this.aaaStock = aaaStock;
    }

    @Override
    public void execute() {
        aaaStock.buy();
    }
}
