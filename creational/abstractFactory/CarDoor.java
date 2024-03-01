package creational.abstractFactory;

public class CarDoor extends CarDoorFactory {
    @Override
    public void make() {
        System.out.println("制作车门");
    }
}
