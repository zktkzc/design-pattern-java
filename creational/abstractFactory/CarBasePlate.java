package creational.abstractFactory;

public class CarBasePlate extends BasePlateFactory {
    @Override
    public void make() {
        System.out.println("制作底盘");
    }
}
