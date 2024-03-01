package creational.factoryMethod;

public class JavaCourseFactory extends CourseFactory{
    @Override
    public Course getCourse() {
        return new JavaCourse();
    }
}
