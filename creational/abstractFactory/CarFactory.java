package creational.abstractFactory;

public interface CarFactory {
    // 车门
    public CarDoor getCarDoor();
    // 车架
    public CarFrame getCarFrame();
    // 底盘
    public CarBasePlate getCarBasePlate();
    // 生产汽车
    public void make();
}
