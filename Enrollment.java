public class Enrollment {
    public static void enrollStudentInCourse(Student student, Course course) {
        student.enrollInCourse(course);
        System.out.println(student.getName() + " has been enrolled in " + course.getCourseName() + ".");
    }
}
