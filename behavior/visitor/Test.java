package behavior.visitor;

public class Test {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerDisplayVisitor());
    }
}
