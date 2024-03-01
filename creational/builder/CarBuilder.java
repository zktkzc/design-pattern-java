package creational.builder;

public class CarBuilder extends Builder{
    private Car car = new Car();

    @Override
    public void buildBasePlate(String basePlate) {
        this.car.setBasePlate(basePlate);
    }

    @Override
    public void buildFrame(String frame) {
        this.car.setFrame(frame);
    }

    @Override
    public void buildDoor(String door) {
        this.car.setDoor(door);
    }

    @Override
    public Car makeCar() {
        return this.car;
    }
}
