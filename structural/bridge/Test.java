package structural.bridge;

public class Test {
    public static void main(String[] args) {
        // 使用工具绘制图形
        Tools tools1 = new Pencil(new Circle());
        tools1.use();

        Tools tools2 = new Pen(new Square());
        tools2.use();
    }
}
