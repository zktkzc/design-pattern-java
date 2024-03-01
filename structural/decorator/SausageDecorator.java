package structural.decorator;

public class SausageDecorator extends ADecorator{
    @Override
    protected String getInfo() {
        return super.getInfo() + "，加一根香肠";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 3;
    }

    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected void something() {

    }
}
