package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ManagementFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            System.out.println("====================================");
            System.out.println("创建部门经理：" + department);
            manager = new Manager(department, department + "部门来此汇报工作");
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
