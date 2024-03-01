package structural.faced;

public class Test {
    public static void main(String[] args) {
        Food food = new Food();
        food.setName("鱼香肉丝");
        TakingSystem takingSystem = new TakingSystem();
        takingSystem.orderTaking(food);
    }
}
