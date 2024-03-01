package behavior.templateMethod;

public class DesignPatternClass extends AClass{
    private boolean flag;

    public DesignPatternClass(boolean flag) {
        this.flag = flag;
    }

    @Override
    protected boolean flag() {
        return this.flag;
    }

    @Override
    public void doSomething() {
        System.out.println("提供设计模式课程的源代码");
    }
}
