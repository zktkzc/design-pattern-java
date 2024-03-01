package behavior.interpreter;

public class Test {
    public static void main(String[] args) {
        Expression zhagnsan = new TerminalExpression("zhangsan");
        Expression lisi = new TerminalExpression("lisi");
        OrExpression orExpression = new OrExpression(zhagnsan, lisi);
        System.out.println("张三是一个男人吗？" + orExpression.interpret("zhangsan"));
        Expression wangwu = new TerminalExpression("wangwu");
        Expression zhaoliu = new TerminalExpression("married");
        AddExpression addExpression = new AddExpression(wangwu, zhaoliu);
        System.out.println("王五是否已婚？" + addExpression.interpret("wangwu married"));
    }
}
