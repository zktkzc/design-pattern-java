package behavior.command;

/**
 * 股票类
 */
public class Stock {
    private String name = "aaa";
    private int count = 10;

    public void buy() {
        System.out.println("购买 [股票：" + name + "]，数量： " + count + "支");
    }

    public void sale() {
        System.out.println("卖出 [股票：" + name + "]，数量： " + count + "支");
    }
}
