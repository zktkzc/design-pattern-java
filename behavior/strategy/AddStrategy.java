package behavior.strategy;

public class AddStrategy implements Strategy {
    @Override
    public int operation(int num1, int num2) {
        return num1 + num2;
    }
}
