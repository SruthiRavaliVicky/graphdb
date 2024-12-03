import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String studentId;
    private List<Course> courses;

    // Constructor
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    // Method to enroll a student in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    // Method to display student details and enrolled courses
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Enrolled Courses:");
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (Course course : courses) {
                course.displayCourseDetails();
                System.out.println();
            }
        }
    }
}
