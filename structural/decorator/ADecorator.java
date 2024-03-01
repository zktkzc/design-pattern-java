package structural.decorator;

public abstract class ADecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    public ADecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getInfo() {
        return this.aBatterCake.getInfo();
    }

    @Override
    protected int getCost() {
        return this.aBatterCake.getCost();
    }

    protected abstract void something();
}
