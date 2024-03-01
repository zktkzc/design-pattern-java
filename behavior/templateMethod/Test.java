package behavior.templateMethod;

public class Test {
    public static void main(String[] args) {
        AClass c = new DesignPatternClass(true);
        c.makeClass();
        System.out.println("==============================");
        c = new H5Class();
        c.makeClass();
    }
}
