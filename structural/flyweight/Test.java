package structural.flyweight;

public class Test {
    private static final String[] DEPARTMENTS = new String[]{"市场部", "营销部", "广告部", "业务服务部"};

    public static void main(String[] args) {
        for (String department : DEPARTMENTS) {
            Employee manager = ManagementFactory.getManager(department);
            manager.report();
            System.out.println(department + "部门会报完成");
            System.out.println("====================================");
        }
    }
}
