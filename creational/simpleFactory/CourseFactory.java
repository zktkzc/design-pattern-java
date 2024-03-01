package creational.simpleFactory;

public class CourseFactory {
    public Course getCourse(String course) {
        if ("java".equalsIgnoreCase(course)) {
            // 创建Java课程对象，并返回
            return new JavaCourse();
        } else if ("python".equalsIgnoreCase(course)) {
            // 创建python课程对象，并返回
            return new PythonCourse();
        }
        return null;
    }
}
