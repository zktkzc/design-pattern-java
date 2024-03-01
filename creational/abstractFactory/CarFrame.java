package creational.abstractFactory;

public class CarFrame extends FrameFactory {
    @Override
    public void make() {
        System.out.println("制作车架");
    }
}
