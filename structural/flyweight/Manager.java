package structural.flyweight;

public class Manager implements Employee{
    private String department;
    private String content;

    public Manager() {
    }

    public Manager(String department, String content) {
        this.department = department;
        this.content = content;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void report() {
        System.out.println(this.content);
    }
}
