package creational.abstractFactory;

public class Car implements CarFactory{
    private CarDoor carDoor = null;
    private CarFrame carFrame = null;
    private CarBasePlate carBasePlate = null;

    @Override
    public CarDoor getCarDoor() {
        this.carDoor = new CarDoor();
        return this.carDoor;
    }

    @Override
    public CarFrame getCarFrame() {
        this.carFrame = new CarFrame();
        return this.carFrame;
    }

    @Override
    public CarBasePlate getCarBasePlate() {
        this.carBasePlate = new CarBasePlate();
        return this.carBasePlate;
    }

    @Override
    public void make() {
        carDoor.make();
        carFrame.make();
        carBasePlate.make();
        System.out.println("汽车生产完成");
    }
}
