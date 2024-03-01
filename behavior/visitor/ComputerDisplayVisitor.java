package behavior.visitor;

public class ComputerDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("组装键盘：" + keyboard);
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("组装鼠标：" + mouse);
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("组装显示器：" + monitor);
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("电脑组装完成：" + computer);
    }
}
