package structural.decorator;

public class BatterCake extends ABatterCake {
    @Override
    protected String getInfo() {
        return "煎饼";
    }

    @Override
    protected int getCost() {
        return 6;
    }
}
