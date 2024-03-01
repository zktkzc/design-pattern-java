package behavior.visitor;

/**
 * 主机
 */
public class Computer implements ComputerPart {
    private ComputerPart[] parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
