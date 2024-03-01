package behavior.strategy;

public class Test {
    public static void main(String[] args) {
        Operation operation = new Operation(new AddStrategy());
        System.out.println(operation.execute(1, 3));
        System.out.println("========================");
        operation = new Operation(new SubtractStrategy());
        System.out.println(operation.execute(1, 3));
        System.out.println("========================");
        operation = new Operation(new MultiplyStrategy());
        System.out.println(operation.execute(1, 3));
    }
}
