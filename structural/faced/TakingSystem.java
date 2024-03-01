package structural.faced;

public class TakingSystem {
    private SelectFoodService selectFoodService;
    private PayService payService;
    private OrderService orderService;
    private TakeService takeService;

    public TakingSystem() {
        selectFoodService = new SelectFoodService();
        payService = new PayService();
        orderService = new OrderService();
        takeService = new TakeService();
    }

    public void orderTaking(Food food) {
        // 点餐
        selectFoodService.select(food.getName());
        // 校验余额
        boolean b = payService.checkBalance();
        if (b) {
            // 支付
            payService.pay();
            // 生成订单
            orderService.makeOrder();
            // 制作外卖
            takeService.taking();
        }
    }
}
