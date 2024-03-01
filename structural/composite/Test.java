package structural.composite;

public class Test {
    public static void main(String[] args) {
        // 创建CEO
        Employee ceo = new Employee("张三", "1", 20000L);
        // 创建部门经理
        Employee manager = new Employee("李四", "2", 10000L);
        // 创建销售员
        Employee saler1 = new Employee("王五", "3", 5000L);
        Employee saler2 = new Employee("田七", "3", 5000L);
        // 创建仓库管理员
        Employee stock = new Employee("赵六", "4", 3000L);
        // 添加层级关系
        ceo.add(manager);
        manager.add(saler1);
        manager.add(saler2);
        manager.add(stock);
        System.out.println(ceo);
        for (Employee employee : ceo.getEmployeeList()) {
            System.out.println("姓名：" + employee.getName() +
                    " 部门编号：" + employee.getDeptNo() +
                    " 薪资：" + employee.getSalary()
            );
            for (Employee e : employee.getEmployeeList()) {
                System.out.println("姓名：" + e.getName() +
                        " 部门编号：" + e.getDeptNo() +
                        " 薪资：" + e.getSalary()
                );
            }
        }
    }
}
