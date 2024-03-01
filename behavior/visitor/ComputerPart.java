package behavior.visitor;

/**
 * 电脑组件接口
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
