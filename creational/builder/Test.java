package creational.builder;

public class Test {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        CarBuilder carBuilder = new CarBuilder();
        engineer.setCarBuilder(carBuilder);
        Car car = engineer.makeCar("底盘", "车架", "车门");
        System.out.println(car);
    }
}
