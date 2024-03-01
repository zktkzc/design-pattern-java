package behavior.command;

/**
 * 出售股票
 */
public class SaleStock implements Order{
    private Stock aaaStock;

    public SaleStock(Stock aaaStock) {
        this.aaaStock = aaaStock;
    }

    @Override
    public void execute() {
        aaaStock.sale();
    }
}
