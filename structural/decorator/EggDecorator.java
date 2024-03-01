package structural.decorator;

public class EggDecorator extends ADecorator {

    @Override
    protected String getInfo() {
        return super.getInfo() + "，加一个鸡蛋";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }

    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected void something() {

    }
}
