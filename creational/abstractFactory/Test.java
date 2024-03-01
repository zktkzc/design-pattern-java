package creational.abstractFactory;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.getCarDoor();
        car.getCarBasePlate();
        car.getCarFrame();
        car.make();
    }
}
