package creational.simpleFactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        Course javaCourse = factory.getCourse("java");
        javaCourse.make();
        Course pythonCourse = factory.getCourse("python");
        pythonCourse.make();
    }
}
