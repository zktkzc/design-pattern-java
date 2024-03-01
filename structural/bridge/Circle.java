package structural.bridge;

public class Circle implements Shape {
    @Override
    public void draw(String tool) {
        System.out.println("使用" + tool + "画了一个圆形");
    }
}
